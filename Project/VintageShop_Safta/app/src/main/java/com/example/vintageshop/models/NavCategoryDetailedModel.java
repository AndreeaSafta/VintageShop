package com.example.vintageshop.models;

public class NavCategoryDetailedModel {
    String name;
    String img_url;
    String type;
    double  price;

    public NavCategoryDetailedModel(String name, double price, String type, String img_url) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.img_url = img_url;
    }

    public NavCategoryDetailedModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
