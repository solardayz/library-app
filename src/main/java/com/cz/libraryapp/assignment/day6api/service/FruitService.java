package com.cz.libraryapp.assignment.day6api.service;

import com.cz.libraryapp.assignment.day6api.model.Fruit;
import com.cz.libraryapp.assignment.day6api.model.dto.FruitRequest;
import com.cz.libraryapp.assignment.day6api.model.dto.FruitSalesResponse;
import com.cz.libraryapp.assignment.day6api.repository.FruitInterfaceRepository;
import com.cz.libraryapp.assignment.day6api.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitService {

    @Autowired
    private FruitInterfaceRepository fruitRepository;

    public void save(FruitRequest request) {
        fruitRepository.save(request);
    }

    public FruitSalesResponse findFruitSales() {
        return fruitRepository.fruitSalesResponse();
    }

    public List<Fruit> findAll() {
        return fruitRepository.findAll();
    }
}
