package com.itonk5.Controllers;

/**
 * Created by lassehavenielsen on 17/05/2016.
 *
@RestController
public class ProductRestController {

    @RequestMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts(){
        List<Product> col = new ArrayList<>();
        col.add(new Product((long) 1, "Topman Black Pants", 22.95, Category.Pants, "Top quality pants, made for you. The black color is an elegant choice", "http://images.askmen.com/fashion/apparel/1273784368_topman-black-pants_1.jpg"));
        col.add(new Product((long) 2, "Topman Navy Pants", 22.95, Category.Pants, "Top quality pants, made for you. The navy color is an elegant choice", "http://g.nordstromimage.com/ImageGallery/store/product/Large/7/_12036607.jpg"));
        col.add(new Product((long) 3, "Ralph Lauren Silk-Cotton Pant", 32.95, Category.Pants, "Ralph Laurens no. 1 pant. Made of silk cotton. Flat-front (no pleats)...Zipper fly,slide clasp with hidden button,belt loops,2 angled front pockets, 2 back pockets with button closure and coin pocket.. Not lined. Dry Clean.", "http://ecx.images-amazon.com/images/I/41U-mmtgqCL._SX342_.jpg"));
        return new ResponseEntity<>(col, HttpStatus.OK);
    }
}
 */