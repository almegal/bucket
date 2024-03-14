package com.bucket.bycketspring.service;

import com.bucket.bycketspring.error.ExceptionIncorrectIDParametr;
import com.bucket.bycketspring.model.Storage;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StorageServiceImp implements StorageService {
    private final Storage storage;

    public StorageServiceImp(Storage storage) {
        this.storage = storage;
    }

    @Override
    public Map<String, Integer> add(List<Long> ids) {
        ids.forEach(id -> {
            String key = convertID(id);
            storage.add(key);
        });
        return getUsersStorage();
    }

    @Override
    public Map<String, Integer> getUsersStorage() {
        return storage.getUsersStorage();
    }

    private String convertID(Long ID) {
        String convertID;
        try {
            convertID = String.valueOf(ID);
        } catch (Exception e) {
            throw new ExceptionIncorrectIDParametr("The ID parametr connot be converted to string");
        }
        return convertID;
    }
}
