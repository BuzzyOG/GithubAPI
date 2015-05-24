

package com.buzzyog.githubapi;

import com.google.gson.annotations.SerializedName;

public class GitHubIssue {

    @SerializedName("html_url")
    private String url;

    @SerializedName("number")
    private int number;

    @SerializedName("title")
    private String title;

    @SerializedName("body")
    private String body;

    @SerializedName("state")
    private String state;

    @SerializedName("comments")
    private int comments;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("updated_at")
    private String updatedAt;

    @SerializedName("closed_at")
    private String closedAt;

    protected String repoFullName;
    protected GitHubUser reportedBy;

    public GitHubUser getReporter() {
        if (reportedBy == null) {
            reportedBy = GitHub.getGitHub().getReporterOf(this);
        }
        return reportedBy;
    }

    public String getUrl() {
        return url;
    }

    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getState() {
        return state;
    }

    public int getComments() {
        return comments;
    }

    public String getDateCreated() {
        if (createdAt != null) {
            return createdAt.split("T")[0];
        }
        return null;
    }

    public String getDateUpdated() {
        if (updatedAt != null) {
            return updatedAt.split("T")[0];
        }
        return null;
    }

    public String getDateClosed() {
        if (closedAt != null) {
            return closedAt.split("T")[0];
        }
        return null;
    }
}