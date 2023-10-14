package com.msku.example.week2;

public class Animal {
    private  int image;
    private String text;

    public Animal(String text,int image ) {
        this.text = text;
        this.image = image;

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
