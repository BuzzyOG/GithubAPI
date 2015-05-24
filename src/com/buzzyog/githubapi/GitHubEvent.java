
package com.buzzyog.githubapi;

public enum GitHubEvent {

    ALL("*"),
    COMMENT_COMMIT("commit_comment"),
    CREATE,
    DELETE,
    DEPLOYMENT_STATUS,
    DEPLOYMENT,
    FORK,
    WIKI_UPDATE("gollum"),
    COMMENT_ISSUE("issue_comment"),
    ISSUE("issues"),
    MEMBER,
    PAGE_BUILD,
    REPOSITORY_STATUS("public"),
    PULL_REQUEST_REVIEW_COMMENT,
    PULL_REQUEST,
    PUSH,
    RELEASE,
    STATUS,
    TEAM_ADD,
    WATCH;

    private String jsonName;

    GitHubEvent() {
        this.jsonName = this.toString().toLowerCase();
    }

    GitHubEvent(String jsonName) {
        this.jsonName = jsonName;
    }

    public String getJsonName() {
        return jsonName;
    }

    public static GitHubEvent getByJsonName(String name) {
        for (GitHubEvent event : GitHubEvent.values()) {
            if (event.getJsonName().equalsIgnoreCase(name)) {
                return event;
            }
        }
        return null;
    }
}