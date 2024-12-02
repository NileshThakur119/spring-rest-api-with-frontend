package com.registration.registration.controller;

import com.registration.registration.entity.User;
import com.registration.registration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class RegistrationController {
    @Autowired
    private UserService UserService;

    @GetMapping("/test")
    public String test() {
        return "Sucess";
    }

    @PostMapping("/user")
    public User addUser(@RequestBody User User) {
        return UserService.addUser(User);
    }

    @GetMapping("/user")
    public List<User> listUser() {
        return UserService.listUser();
    }

    @GetMapping("/user/{id}")
    public User fetchUserById(@PathVariable("id") Long UserID) {
        return UserService.fetchUserById(UserID);
    }

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable("id") Long UserID) {
        return UserService.deleteUser(UserID);
    }

    @PutMapping("/user/{id}")
    public User editUser(@PathVariable("id") Long UserID, @RequestBody User User) {
        return UserService.editUser(UserID, User);
    }
}
