package com.dgmdev.jwt_security.Controller;

import com.dgmdev.jwt_security.Model.User;
import com.dgmdev.jwt_security.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/users")
    public List<User> getUsers(){
        System.out.println("Getting users");
        return this.userService.getUsers();
    }


}
