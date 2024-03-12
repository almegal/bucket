package com.bucket.bycketspring.model;

import com.bucket.bycketspring.error.ExceptionIncorrectIDParametr;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.awt.event.ItemEvent;
import java.util.*;

@Repository
@SessionScope
public class Storage {
    private final Map<String, Integer> storage;

    public Storage() {
        this.storage = new HashMap<>();
    }

    public Map<String, Integer> getUsersStorage() {
        return storage;
    }

    public void add(String key) {
        storage.computeIfPresent(key, (k, v) -> ++v);
        storage.computeIfAbsent(key, value -> 1);
    }
}
