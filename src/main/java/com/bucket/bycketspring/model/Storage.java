package com.bucket.bycketspring.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
@Scope("session")
public class Storage {
    private final Map<String, Item> storage = new HashMap<>();

    public Map<String, Item> getStorage() {
        return storage;
    }
    public Item add(String ID, Item item) {
        return storage.put(ID, item);
    }
    public Item get(String ID) {
        return storage.get(ID);
    }

}
