package com.example.madgoatlog4shell.Model;

public class GoatShell {
    private final String name;
    private final String description;

    public GoatShell(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
