package com.orders;

public class Product {

    private String type;
    private String brand;
    private String model;

    Product(String type, String brand, String model) {
        this.type = type;
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return type + " " + brand + " " + model;
    }

    public String getType() {
        return this.type;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }
}