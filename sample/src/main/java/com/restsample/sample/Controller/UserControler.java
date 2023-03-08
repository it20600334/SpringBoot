package com.restsample.sample.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/mapping/user")
@CrossOrigin
public class UserControler {

    @GetMapping("/getUser")
     public String getUser() {

        return"sample_root";
        
     }

     @PostMapping("/addUser")
     public String saveUser(){
        return "User Saved";
     }

     @PutMapping("/updateUser")
     public String UpdateUser(){
        return "User Updated";
     }

     @DeleteMapping("/deleteUser")
     public String deleteUser(){

        return"User Deleted";
     }
}
