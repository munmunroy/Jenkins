package com.Jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

    @GetMapping("/jenkins")
    public  String helloword()
    {
        return "Hi Jenkins!..";
    }
}
