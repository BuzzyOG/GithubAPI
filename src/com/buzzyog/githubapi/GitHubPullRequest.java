
package com.buzzyog.githubapi;

import com.google.gson.annotations.SerializedName;

public class GitHubPullRequest extends GitHubIssue {

    @SerializedName("merged")
    private boolean merged;

    @SerializedName("review_comments")
    private int reviewComments;

    @SerializedName("commits")
    private int commits;

    @SerializedName("additions")
    private int additions;

    @SerializedName("deletions")
    private int deletions;

    @SerializedName("changed_files")
    private int changedFiles;

    @SerializedName("merged_at")
    private String mergedAt;

    @SerializedName("merge_commit_sha")
    private String mergeCommit;

    public boolean isMerged() {
        return merged;
    }

    public int getReviewComments() {
        return reviewComments;
    }

    public int getCommits() {
        return commits;
    }

    public int getAdditions() {
        return additions;
    }

    public int getDeletions() {
        return deletions;
    }

    public int getChangedFiles() {
        return changedFiles;
    }

    public String getMergedAt() {
        return mergedAt;
    }

    public String getMergeCommit() {
        return mergeCommit;
    }
}