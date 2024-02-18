package com.cz.libraryapp.assignment.day6api.repository;

import com.cz.libraryapp.assignment.day6api.model.Fruit;
import com.cz.libraryapp.assignment.day6api.model.dto.FruitRequest;
import com.cz.libraryapp.assignment.day6api.model.dto.FruitSalesResponse;

import java.util.List;

//편의상 FruitInterfaceRepository로 명칭을 변경하여 만듬
public interface FruitInterfaceRepository {
        void save(FruitRequest request);
        FruitSalesResponse fruitSalesResponse();
        List<Fruit> findAll();
}
