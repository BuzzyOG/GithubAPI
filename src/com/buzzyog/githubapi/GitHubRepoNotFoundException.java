
package com.buzzyog.githubapi;

public class GitHubRepoNotFoundException extends GitHubException {

    public GitHubRepoNotFoundException(String s) {
        super(s);
    }

    public GitHubRepoNotFoundException(String s, Throwable throwable) {
        super(s, throwable);
    }
}