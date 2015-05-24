
package com.buzzyog.githubapi;

public class GistException extends RuntimeException {

    public GistException(String s, Throwable throwable) {
        super(s, throwable);
    }
}