package com.bucket.bycketspring.service;

import com.bucket.bycketspring.error.ExceprionIncorrectIdParametr;
import com.bucket.bycketspring.model.Item;
import com.bucket.bycketspring.model.Storage;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class StorageServiceImp implements StorageService<Item>{
    private final Storage storage;

    public StorageServiceImp(Storage storage) {
        this.storage = storage;
    }

    @Override
    public Item add(int ID, String productName) {
        final Item item = new Item(ID, productName);
        final String convertID = convertID(ID);

        return storage.add(convertID, item);
    }

    @Override
    public Item get(int ID) {
        final String convertID = convertID(ID);
        return storage.get(convertID);
    }

    @Override
    public Map<String, Item> all() {
        return storage.getStorage();
    }

    private String convertID(int ID) {
        String convertID;
        try {
            convertID = String.valueOf(ID);
        } catch (Exception e) {
            throw new ExceprionIncorrectIdParametr("The ID parametr connot be converted to string");
        }
        return convertID;
    }
}
