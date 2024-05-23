
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/greetapi/v1")
public class Controller {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name", defaultValue = "hello world") String name){

     return "Hello" + name;
    }




    




    
}
