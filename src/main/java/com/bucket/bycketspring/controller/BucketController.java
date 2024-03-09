package com.bucket.bycketspring.controller;

import com.bucket.bycketspring.model.Item;
import com.bucket.bycketspring.service.StorageService;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@Scope("session")
@RequestMapping("/order")
public class BucketController {
    private final StorageService<Item> storageService;
    public BucketController(StorageService<Item> storageService) {
        this.storageService = storageService;
    }

    @GetMapping(path="/add")
    public Item add(@RequestParam("ID") int ID,
                    @RequestParam("productName") String productName){
        return storageService.add(ID, productName);
    }

    @GetMapping(path="/get")
    public Item get(@RequestParam("ID") int ID){
        return storageService.get(ID);
    }
    @GetMapping(path="/all")
    public Map<String, Item> all() {
        return storageService.all();
    }
}
