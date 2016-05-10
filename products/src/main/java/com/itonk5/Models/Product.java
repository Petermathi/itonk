package com.itonk5.Models;

/**
 * Created by lassehavenielsen on 10/05/2016.
 */
public class Product {
    private Long id;
    private String name;
    private Double price;
    private Category category;
    private String description;
    private String imageUrl;

    public Product() {

    }

    public Product(Long id, String name, Double price, Category category, String description, String imageUrl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl()
    {
        return imageUrl;
    }
}
