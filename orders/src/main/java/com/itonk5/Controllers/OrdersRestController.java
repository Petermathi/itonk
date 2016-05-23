package com.itonk5.Controllers;

import com.itonk5.Product;
import com.itonk5.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/orders")
public class OrdersRestController {

  private Map<String, List<Order>> orders = new HashMap<>();

  @RequestMapping(method = RequestMethod.GET)
  public ResponseEntity<Collection<List<Order>> > getOrders(){
    return new ResponseEntity<>(orders.values(), HttpStatus.OK);
  }


  @RequestMapping(method = RequestMethod.GET, value = "/{username}")
  public ResponseEntity<List<Order>> getOrdersWithUsername(@PathVariable String username) {
    List<Product> products = new ArrayList();
    List<Order> pieOrders = new ArrayList();
    products.add(
      new Product((long) 1,
                  "Topman Black Pants",
                  22.95,
                  "Top quality pants, made for you. The black color is an elegant choice"
                  )
    );
    products.add(
      new Product((long) 2,
                  "Topman Navy Pants",
                  22.95,
                  "Top quality pants, made for you. The navy color is an elegant choice"
                  )
    );

    pieOrders.add(new Order("Peter",
                            "Mathiasen",
                            "Pie1",
                            products
                            )
    );
    orders.put("Peter", pieOrders);
    orders.put("test", pieOrders);
    orders.put("test2", pieOrders);
    return new ResponseEntity<>(orders.get(username),HttpStatus.OK);
  }

  /* @RequestMapping(method = RequestMethod.POST)
  public ResponseEntity<?> newOrder(@RequestBody Order input) {
        orders.get(input.getUserName());
    return new ResponseEntity<>(HttpStatus.CREATED);
  }
  */
}
