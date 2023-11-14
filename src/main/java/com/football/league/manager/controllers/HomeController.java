package com.football.league.manager.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag( name = "Hello World", description = "Hello World endpoint to test server." )
@RequestMapping( "/v1" )
@RestController
public class HomeController {
    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World!";
    }
}
