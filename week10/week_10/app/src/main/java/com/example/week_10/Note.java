package com.example.week_10;


import com.google.firebase.Timestamp;
import com.google.firebase.database.Exclude;

public class Note {
    @Exclude
    private String id;
    private com.google.firebase.Timestamp date;
    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

