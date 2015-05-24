
package com.buzzyog.githubapi;

import org.pircbotx.Colors;

public enum IssueState {

    OPEN("open", Colors.GREEN, Colors.UNDERLINE),
    CLOSED("closed", Colors.RED, Colors.UNDERLINE);

    private String ident;
    private String[] colours;

    IssueState(String ident, String... colours) {
        this.ident = ident;
        this.colours = colours;
    }

    public String format(String toFormat) {
        StringBuilder builder = new StringBuilder();
        for (String s : getColours()) {
            builder.append(s);
        }
        return builder.append(toFormat).toString();
    }

    public String[] getColours() {
        return colours;
    }

    public String getIdent() {
        return ident;
    }

    public static IssueState getByIdent(String ident) {
        for (IssueState s : IssueState.values()) {
            if (s.getIdent().equals(ident)) {
                return s;
            }
        }
        return null;
    }
}