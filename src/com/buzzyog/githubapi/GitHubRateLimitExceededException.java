
package com.buzzyog.githubapi;

public class GitHubRateLimitExceededException extends GitHubException {

    public GitHubRateLimitExceededException(String s) {
        super(s);
    }
}