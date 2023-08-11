package com.project.OnlineShop.Controller;

import com.project.OnlineShop.Entity.PublicUser;
import com.project.OnlineShop.Entity.User;
import com.project.OnlineShop.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    UserService userService;

    UserController(UserService userService){ this.userService=userService;}

    @GetMapping("{id}")
    ResponseEntity<PublicUser> GetUser(@PathVariable int id)
    {
        return ResponseEntity.ok(userService.findById(id).getPublicUser());

    }

    @GetMapping
    ResponseEntity<List<PublicUser>> GetUsers()
    {
        List<User> users= userService.findAll();
        //not finished I think
        List<PublicUser> publicUsers= users.stream().map(User::getPublicUser).toList();
        return ResponseEntity.ok(publicUsers);
    }
}
