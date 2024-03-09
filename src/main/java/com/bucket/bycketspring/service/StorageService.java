package com.bucket.bycketspring.service;

import java.util.Map;

public interface StorageService<T> {
    public T add(int ID, String productName);
    public T get(int ID);
    public Map<String, T> all();

}
