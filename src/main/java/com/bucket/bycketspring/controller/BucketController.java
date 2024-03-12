package com.bucket.bycketspring.controller;

import com.bucket.bycketspring.service.StorageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class BucketController {
    private final StorageService storageService;

    public BucketController(StorageService storageService) {
        this.storageService = storageService;
    }

    @GetMapping(path="/add")
    public Map<String, Integer> add(@RequestParam("ID") List<Long> IDs){
        return storageService.add(IDs);
    }
    @GetMapping(path="/get")
    public Map<String, Integer> get(){
        return storageService.getUsersStorage();
    }

}
