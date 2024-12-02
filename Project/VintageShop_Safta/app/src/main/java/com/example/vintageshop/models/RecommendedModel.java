package com.example.vintageshop.models;

public class RecommendedModel {
    String name;
    String description;
    String rating;
    String img_url;
    double price;


    public RecommendedModel(){

    }

    public RecommendedModel(String name, String rating, String description, String img_url, int price) {
        this.name = name;
        this.rating = rating;
        this.description = description;
        this.img_url = img_url;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }
}
