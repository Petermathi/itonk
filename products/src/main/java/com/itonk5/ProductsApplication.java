package com.itonk5;


import com.itonk5.Models.Category;
import com.itonk5.Models.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
@RestController
public class ProductsApplication {

	@RequestMapping(value = "/products")
	public List<Product> available() {
		List<Product> products = new ArrayList<>();
		products.add(new Product((long) 1, "Topman Black Pants", 22.95, Category.Pants, "Top quality pants, made for you.", "http://images.askmen.com/fashion/apparel/1273784368_topman-black-pants_1.jpg"));
		//Add more products here...
		return products;
	}

	public static void main(String[] args) {
		SpringApplication.run(ProductsApplication.class, args);
	}
}
