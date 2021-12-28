package br.com.leather.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/leathers")
public class LeatherController {

    @GetMapping("/")
    public String helloWorld(){
        return "Hello World OK!";
    }
}
