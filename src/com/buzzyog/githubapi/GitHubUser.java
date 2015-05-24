
package com.buzzyog.githubapi;

import com.google.gson.annotations.SerializedName;

public class GitHubUser {

    @SerializedName("login")
    private String login;

    @SerializedName("html_url")
    private String url;

    public String getLogin() {
        return login;
    }

    public String getUrl() {
        return url;
    }
}