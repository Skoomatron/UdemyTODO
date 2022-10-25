package com.example.udemytodo.datamodel;

import java.time.LocalDate;

public class TodoItem {
    private String shortDescription;
    private String fullDescription;
    private LocalDate deadline;

    public TodoItem(String shortDescription, String fullDescription, LocalDate deadline) {
        this.shortDescription = shortDescription;
        this.fullDescription = fullDescription;
        this.deadline = deadline;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }
}
