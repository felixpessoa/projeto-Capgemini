package com.todoApp.msproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api.project")
public class ProjectController {

    @GetMapping
    public String status(){
        return "ok";
    }
    
}
