package org.example.demospringsecurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String homePage(HttpServletRequest request){
        return "Welcome to NR place. " + request.getSession().getId();
    }

}
