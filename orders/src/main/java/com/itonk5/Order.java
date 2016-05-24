package com.itonk5;

import java.util.List;

public class Order {

  private String firstName;
  private String lastName;
  private String userName;
  private List<Item> products;
  private Double totalPrice;

  public Order(String fname, String lname, String userName, List<Item> products, Double tPrice) {
    this.firstName = fname;
    this.lastName = lname;
    this.userName = userName;
    this.products = products;
    this.totalPrice = tPrice;



  }

  public String getFullName() {return firstName + " " + lastName;}
  public String getFirstName() {return firstName;}
  public String getLastName() {return lastName;}
  public String getUserName() {return userName;}
  public List<Item> getProducts() {return products;}
}
