package com.itonk5;

import java.util.*;
import com.itonk5.Item;

public class Order {

  private String firstName;
  private String lastName;
  private String userName;
  private List<Item> products;

  public Order(String fname, String lname, String userName, List products) {
    this.firstName = fname;
    this.lastName = lname;
    this.userName = userName;
    this.products = products;

  }

  public String getFullName() {return firstName + " " + lastName;}
  public String getFirstName() {return firstName;}
  public String getLastName() {return lastName;}
  public String getUserName() {return userName;}
  public List<Item> getProducts() {return products;}
}
