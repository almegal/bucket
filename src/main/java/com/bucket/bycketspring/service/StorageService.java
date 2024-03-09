package com.bucket.bycketspring.service;

import com.bucket.bycketspring.model.Item;

import java.util.Map;

public interface StorageService {
    public Item add(int ID, String productName);
    public Item get(int ID);
    public Map<String, Item> all();

}
