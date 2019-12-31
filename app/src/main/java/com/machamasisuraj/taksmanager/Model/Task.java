package com.machamasisuraj.taksmanager.Model;

public class Task {

    private String name;

    private Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


