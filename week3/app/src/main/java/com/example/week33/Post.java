package com.example.week33;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.Message;

public class Post {
    private Bitmap image;
    private Location location;
    private String message;
    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
