package com.mycompany.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @GetMapping("/")
    public String index(){
            return "The Local Host is running";
    }

    @PostMapping("/user")
    public void user(@RequestHeader String a){
        System.out.println(a);
    }
}
