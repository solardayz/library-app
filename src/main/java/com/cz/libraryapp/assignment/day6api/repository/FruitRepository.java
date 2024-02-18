package com.cz.libraryapp.assignment.day6api.repository;

import com.cz.libraryapp.assignment.day6api.model.Fruit;
import com.cz.libraryapp.assignment.day6api.model.dto.FruitRequest;
import com.cz.libraryapp.assignment.day6api.model.dto.FruitSalesResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class FruitRepository {

    private long makeId= 0L;
    private List<Fruit> fruits = new ArrayList<>();

    public void save(FruitRequest request) {

        for (int i = 0; i < fruits.size(); i++) {
            long fruitId = fruits.get(i).getId();
            if (fruitId == request.getId()) {
                String tempName = fruits.get(i).getName();
                LocalDate tempDate = fruits.get(i).getWarehousingDate();
                long tempPrice = fruits.get(i).getPrice();
                fruits.remove(fruitId);
                fruits.add(new Fruit(fruitId,tempName, tempDate, tempPrice, true));

            } else {
                fruits.add(new Fruit(makeId++, request.getName(), request.getWarehousingDate(), request.getPrice(), false));
            }
        }


    }

    public FruitSalesResponse fruitSalesResponse() {
        long salesAmount = fruits.stream().filter(fruit-> fruit.getSaleYn().equals(true)).mapToLong(Fruit::getPrice).sum();
        long notSalesAmount = fruits.stream().filter(fruit-> fruit.getSaleYn().equals(false)).mapToLong(Fruit::getPrice).sum();
        return new FruitSalesResponse(salesAmount,notSalesAmount);
    }
}
