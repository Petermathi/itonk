package com.itonk5;

/**
 * Created by lassehavenielsen on 10/05/2016.
 */
public class Product {
    private Long id;
    private String name;
    private Double price;
    private String description;
    private String imageUrl;

    public Product() {

    }

    public Product(Long id, String name, Double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public String getImageUrl()
    {
        return imageUrl;
    }
}
