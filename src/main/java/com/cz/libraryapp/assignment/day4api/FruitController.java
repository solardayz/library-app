package com.cz.libraryapp.assignment.day4api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("/api/v1")
@RestController
public class FruitController {

    private List<Fruit> fruits = new ArrayList<>();
    private long makeId= 0L;

    @PostMapping("/fruit")
    public ResponseEntity<String> fruitCreate(@RequestBody FruitRequest request) {
        fruits.add(new Fruit(makeId++, request.getName(), request.getWarehousingDate(), request.getPrice(), false));
        return ResponseEntity.ok("정상 처리 되었습니다.");
    }

    @PutMapping("/fruit")
    public ResponseEntity<String> fruitDelete(@RequestBody FruitRequest request){
        for (int i = 0; i < fruits.size(); i++) {
            long fruitId = fruits.get(i).getId();
            if (fruitId == request.getId()) {
                String tempName = fruits.get(i).getName();
                LocalDate tempDate = fruits.get(i).getWarehousingDate();
                long tempPrice = fruits.get(i).getPrice();
                fruits.remove(fruitId);
                fruits.add(new Fruit(fruitId,tempName, tempDate, tempPrice, true));
                return ResponseEntity.ok("정상 처리 되었습니다.");
            }
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/fruit/stat")
    public FruitSalesResponse sales() {
        long salesAmount = fruits.stream().filter(fruit-> fruit.getSaleYn().equals(true)).mapToLong(Fruit::getPrice).sum();
        long notSalesAmount = fruits.stream().filter(fruit-> fruit.getSaleYn().equals(false)).mapToLong(Fruit::getPrice).sum();
        return new FruitSalesResponse(salesAmount,notSalesAmount);
    }
}
