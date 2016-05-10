package com.itonk5;


import com.itonk5.Models.Category;
import com.itonk5.Models.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
@RestController
public class ProductsApplication {

	private List<Product> products = new ArrayList<Product>() {{
		add(new Product((long) 1, "Topman Black Pants", 22.95, Category.Pants, "Top quality pants, made for you. The black color is an elegant choice", "http://images.askmen.com/fashion/apparel/1273784368_topman-black-pants_1.jpg"));
		add(new Product((long) 2, "Topman Navy Pants", 22.95, Category.Pants, "Top quality pants, made for you. The navy color is an elegant choice", "http://g.nordstromimage.com/ImageGallery/store/product/Large/7/_12036607.jpg"));
		add(new Product((long) 3, "Ralph Lauren Silk-Cotton Pant", 32.95, Category.Pants, "Ralph Laurens no. 1 pant. Made of silk cotton. Flat-front (no pleats)...Zipper fly,slide clasp with hidden button,belt loops,2 angled front pockets, 2 back pockets with button closure and coin pocket.. Not lined. Dry Clean.", "http://ecx.images-amazon.com/images/I/41U-mmtgqCL._SX342_.jpg"));
	}};




	@RequestMapping(value = "/products")
	public List<Product> available() {

		return products;
	}

	@RequestMapping(value = "products/{id}")
	public ResponseEntity<Product> getItemWithId(@PathVariable long id)
	{
		Product result = null;
		for (Product productToReturn : this.products) {
			if (productToReturn.getId() == id) {
				result = productToReturn;
				break;
			}
		}

		if (result == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	public static void main(String[] args) {
		SpringApplication.run(ProductsApplication.class, args);
	}
}
