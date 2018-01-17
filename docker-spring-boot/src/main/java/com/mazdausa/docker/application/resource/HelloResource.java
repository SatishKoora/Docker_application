package com.mazdausa.docker.application.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker/application")
public class HelloResource {

    @GetMapping
    public String hello(){

        return "I'm deployed in docker container successfully";
    }


}
