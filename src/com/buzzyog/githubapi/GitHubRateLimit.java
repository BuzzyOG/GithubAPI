

package com.buzzyog.githubapi;

public class GitHubRateLimit {

    private int limit;
    private int remaining;
    private int reset;

    public int getLimit() {
        return limit;
    }

    public int getRemaining() {
        return remaining;
    }

    public int getTimeUntilReset() {
        return reset;
    }
}