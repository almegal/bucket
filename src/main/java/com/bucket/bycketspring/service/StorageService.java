package com.bucket.bycketspring.service;

import java.util.List;
import java.util.Map;

public interface StorageService {
    public Map<String, Integer> add(List<Long> ids);
    public Map<String, Integer> getUsersStorage();
}
