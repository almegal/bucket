package com.bucket.bycketspring.service;

public interface StorageService {
    public Item add(int ID, String productName);
    public Item get(int ID);
    public Map<String, Item> all();

}
