package com.itonk5;
public class User {


  private String firstName;
  private String lastName;
  private String userName;
  private String passWord;

  public User(String fname, String lname, String userName, String passWord) {
    this.firstName = fname;
    this.lastName = lname;
    this.userName = userName;
    this.passWord = passWord;
  }
  //for JPA
  public User() {}

  public String getFullName() {return firstName + " " + lastName;}
  public String getFirstName() {return firstName;}
  public String getLastName() {return lastName;}
  public String getUserName() {return userName;}
  public boolean login(String username, String password) {
    if(!username.equals(userName)) return false;
    if(!password.equals(passWord)) return false;
    return true;
  }
}
