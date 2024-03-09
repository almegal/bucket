package com.bucket.bycketspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class BucketController {

    @GetMapping(path="/add")
    public String add(){
        return "";
    }

    @GetMapping(path="/get")
    public String get(){
        return "";
    }
}
