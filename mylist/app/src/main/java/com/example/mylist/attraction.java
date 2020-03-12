package com.example.mylist;

public class attraction {
    int image;
    String placename;
    String description;

    public attraction(int image, String placename, String description) {
        this.image = image;
        this.placename = placename;
        this.description = description;
    }

    public attraction() {

    }


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getPlacename() {
        return placename;
    }

    public void setPlacename(String placename) {
        this.placename = placename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}