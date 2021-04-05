package com.nebula.base.application;

import com.nebula.base.domain.entities.User;
import com.nebula.base.domain.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

  private UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }
  
  @GetMapping("/{userId}")
  UserResponse getUser(@PathVariable("userId") Integer userId) {
    // @RequestParam String id => Query Param

    User user = userService.getUserById(userId);
    return new UserResponse(user);
  }


  @PostMapping
  CreateUserResponse createUser(@RequestBody UserRequest userRequest) {

    int id = userService.createUser(userRequest.getUser());

    return new CreateUserResponse(id);
  }

}
