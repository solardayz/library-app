package com.cz.libraryapp.assignment.day6api.repository;

import com.cz.libraryapp.assignment.day6api.model.Fruit;
import com.cz.libraryapp.assignment.day6api.model.dto.FruitRequest;
import com.cz.libraryapp.assignment.day6api.model.dto.FruitSalesResponse;

import java.util.List;

public class FruitMySqlRepository implements FruitInterfaceRepository{
    @Override
    public void save(FruitRequest request) {

    }

    @Override
    public FruitSalesResponse fruitSalesResponse() {
        return null;
    }

    @Override
    public List<Fruit> findAll() {
        return null;
    }
}
