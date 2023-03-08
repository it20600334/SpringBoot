package com.restsample.sample.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
    
}
