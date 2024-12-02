package com.example.vintageshop.models;

import java.io.Serializable;

public class ViewAllModel implements Serializable {

    String name;
    String img_url;
    String type;
    String description;
    String rating;
    double price;


    public ViewAllModel() {
    }

    public ViewAllModel(String name, String img_url, String type, String description, String rating, int price) {
        this.name = name;
        this.img_url = img_url;
        this.type = type;
        this.description = description;
        this.rating = rating;
        this.price = price;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
