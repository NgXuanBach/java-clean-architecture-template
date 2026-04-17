package com.nguyenbach.profolio.clean_architecture_example.domain.model;

public class Course {
    private final String id;
    private final String title;
    private final double price;

    public Course(String id, String title, double price) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title is required");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price must be >= 0");
        }
        this.id = id;
        this.title = title;
        this.price = price;
    }
    public String getId() {return id;}
    public String getTitle() {return title;}
    public double getPrice() {return price;}
}