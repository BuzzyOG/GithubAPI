

package com.buzzyog.githubapi;

import com.google.gson.annotations.SerializedName;

public class GitHubRepo {

    @SerializedName("name")
    private String name;

    @SerializedName("full_name")
    private String fullName;

    @SerializedName("html_url")
    private String url;

    @SerializedName("description")
    private String description;

    @SerializedName("homepage")
    private String homepage;

    @SerializedName("has_wiki")
    private boolean hasWiki;

    @SerializedName("forks_count")
    private int forks;

    @SerializedName("open_issues_count")
    private int openIssues;

    @SerializedName("watchers_count")
    private int watchers;

    @SerializedName("stargazers_count")
    private int stargazers;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("updated_at")
    private String updatedAt;

    @SerializedName("pushed_at")
    private String pushedAt;

    protected boolean isPrivate;
    private GitHubUser repoOwner;
    private GitHubUser[] collaborators;
    private GitHubUser[] contributors;
    private String[] languages;

    public GitHubUser getRepoOwner() {
        if (repoOwner == null) {
            repoOwner = GitHub.getGitHub().getOwnerOf(this);
        }
        return repoOwner;
    }

    public GitHubUser[] getCollaborators() {
        if (collaborators == null) {
            collaborators = GitHub.getGitHub().getCollaborators(this);
        }
        return collaborators;
    }

    public GitHubUser[] getContributors() {
        if (contributors == null) {
            contributors = GitHub.getGitHub().getContributors(this);
        }
        return contributors;
    }

    public String[] getLanguages() {
        if (languages == null) {
            languages = GitHub.getGitHub().getLanguages(this);
        }
        return languages;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    public String getHomepage() {
        return homepage;
    }

    public boolean hasWiki() {
        return hasWiki;
    }

    public int getForksCount() {
        return forks;
    }

    public int getOpenIssuesCount() {
        return openIssues;
    }

    public int getStargazers() {
        return stargazers;
    }

    public String getDateCreated() {
        return createdAt;
    }

    public String getDateLastUpdated() {
        return updatedAt;
    }

    public String getDateLastPushedTo() {
        return pushedAt;
    }

}