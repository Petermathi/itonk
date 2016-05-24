package com.itonk5.Controllers;

import com.itonk5.Item;
import com.itonk5.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/orders")
public class OrdersRestController {

  private Map<String, List<Order>> orders2 = new HashMap<>();


  private List<Order> orders = new ArrayList<Order>();
  private List<Order> result = new ArrayList<Order>();


  @RequestMapping(method = RequestMethod.GET)
  public List<Order> available(){

    if(orders.isEmpty()){

      double totalPrice = 0;
      List<Item> products = new ArrayList();
      products.add(
              new Item((long) 1,
                      "Topman Black Pants",
                      22.95,
                      "Top quality pants, made for you. The black color is an elegant choice"
              )
      );
      products.add(
              new Item((long) 2,
                      "Topman Navy Pants",
                      22.95,
                      "Top quality pants, made for you. The navy color is an elegant choice"
              )
      );

      for(int i=1; i<products.size(); i++){
        totalPrice = totalPrice + products.get(i).getPrice();
      }

      orders.add(new Order("Peter", "Mathiasen", "Pie1", products, totalPrice));
      orders.add(new Order("Test", "McTest", "TestUser", products, totalPrice));
    }
    return orders;
  }


  @RequestMapping(method = RequestMethod.GET, value = "/{username}")
  public ResponseEntity<List<Order>> getOrdersWithUsername(@PathVariable String username) {

    if(orders.isEmpty()){

      double totalPrice = 0;
      List<Item> products = new ArrayList();
      products.add(
              new Item((long) 1,
                      "Topman Black Pants",
                      22.95,
                      "Top quality pants, made for you. The black color is an elegant choice"
              )
      );
      products.add(
              new Item((long) 2,
                      "Topman Navy Pants",
                      22.95,
                      "Top quality pants, made for you. The navy color is an elegant choice"
              )
      );

      for(int i=1; i<products.size(); i++){
        totalPrice = totalPrice + products.get(i).getPrice();
      }

      orders.add(new Order("Peter", "Mathiasen", "Pie1", products, totalPrice));
      orders.add(new Order("Test", "McTest", "TestUser", products, totalPrice));
    }

    result.clear();

    for (Order orderToReturn : orders) {


      if (Objects.equals(orderToReturn.getUserName(), username)) {

        result.add(orderToReturn) ;
      }
    }

    if (result.size() == 0) {

      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }


    return new ResponseEntity<>(result, HttpStatus.OK);

  }

  /* @RequestMapping(method = RequestMethod.POST)
  public ResponseEntity<?> newOrder(@RequestBody Order input) {
        orders.get(input.getUserName());
    return new ResponseEntity<>(HttpStatus.CREATED);
  }
  */
}
