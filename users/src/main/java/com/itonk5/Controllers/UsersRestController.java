package com.itonk5.Controllers;

import com.itonk5.Login;
import com.itonk5.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/users")
public class UsersRestController {

  private Map<String, User> users = new HashMap<>();

  @RequestMapping(method = RequestMethod.GET, path = "/initMap")
  public ResponseEntity<?> initMap(){
    users.put("Pie1", new User("Peter","Mathiasen","Pie1", "PieCluster"));
    users.put("test", new User("test","test","test", "test"));
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @RequestMapping(method = RequestMethod.GET)
  public ResponseEntity<Collection<User> > getAllUsers(){
    return new ResponseEntity<>( users.values(), HttpStatus.OK);
  }

  @RequestMapping(method = RequestMethod.GET, value = "/{username}")
  public ResponseEntity<User> getUserWithId(@PathVariable String username) {
    return new ResponseEntity<>(users.get(username),HttpStatus.OK);
  }

  @RequestMapping(method = RequestMethod.PUT)
  public ResponseEntity<?> addUser(@RequestBody User input) {
    return new ResponseEntity<>(users.put(input.getUserName(),input), HttpStatus.CREATED);
  }

  @RequestMapping(method = RequestMethod.POST, path = "/login")
  public ResponseEntity<?> login(@RequestBody Login input) {
    User usernameLookup = users.get(input.getUsername());
    if(usernameLookup == null) {
      return new ResponseEntity<>("error", HttpStatus.UNAUTHORIZED);
    }
    if(usernameLookup.login(input.getUsername(),input.getPassword())) {
      return new ResponseEntity<>("loggedIn", HttpStatus.OK);
    }
    else {
      return new ResponseEntity<>("error", HttpStatus.UNAUTHORIZED);
    }
  }
}
