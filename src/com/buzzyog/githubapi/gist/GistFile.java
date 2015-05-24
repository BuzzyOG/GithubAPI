

package com.buzzyog.githubapi.gist;

public class GistFile {

    private String content;
    private String fileName;

    public GistFile(String content) {
        this.content = content;
    }

    public GistFile(String fileName, String content) {
        this.fileName = fileName;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public String getFileName() {
        return fileName;
    }
}