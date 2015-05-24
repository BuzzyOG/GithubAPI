

package com.buzzyog.githubapi;

public class GitHubException extends RuntimeException {

    public GitHubException(String s, Throwable throwable) {
        super(s, throwable);
    }

    protected GitHubException(String s) {
        super(s);
    }
}