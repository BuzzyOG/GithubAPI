
package com.buzzyog.githubapi.gist;

import com.google.gson.JsonObject;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Gist {

    private String description;
    private GistFile[] files;
    private boolean isPublic;
    private String date;

    public Gist(GistFile... files) {
        this(false, files);
    }

    public Gist(boolean isPublic, GistFile... files) {
        this("Oh snap! Something went wrong at {date}", isPublic, files);
    }

    public Gist(String description, boolean isPublic, GistFile... files) {
        this.date = new SimpleDateFormat("EEE dd MMM YYYY zzz").format(new Date());
        this.description = description.replace("{date}", this.date);
        this.isPublic = isPublic;
        this.files = files;
    }

    public String getDescription() {
        return description;
    }

    public GistFile[] getFiles() {
        return files;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public String create() {
        try {
            JsonObject gistJson = new JsonObject();
            gistJson.addProperty("description", this.getDescription());
            gistJson.addProperty("public", this.isPublic());

            JsonObject filesJson = new JsonObject();

            for (int i = 0; i < getFiles().length; i++) {
                GistFile gistFile = getFiles()[i];
                JsonObject file = new JsonObject();
                file.addProperty("content", gistFile.getContent());
                String name = gistFile.getFileName();
                filesJson.add((name == null || name.isEmpty() ? "" : name + "-") + date.replace(' ', '_'), file);
            }

            gistJson.add("files", filesJson);

            HttpResponse<JsonNode> response = Unirest.post(GitHub.getGitHub().getApiUrl() + "/gists")
                    .basicAuth(Nexus.getInstance().getConfig().getGistAccountName(), Nexus.getInstance().getConfig().getGistAccountPassword())
                    .header("accept", "application/json")
                    .header("content-type", "application/json; charset=utf-8")
                    .body(gistJson.toString())
                    .asJson();
            return response.getBody().getObject().getString("html_url");
        } catch (UnirestException e) {
            throw new GistException("Failed to Gist!", e);
        }
    }
}