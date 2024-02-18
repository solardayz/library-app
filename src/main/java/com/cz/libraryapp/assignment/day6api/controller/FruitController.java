package com.cz.libraryapp.assignment.day6api.controller;

import com.cz.libraryapp.assignment.day6api.model.dto.FruitRequest;
import com.cz.libraryapp.assignment.day6api.model.dto.FruitSalesResponse;
import com.cz.libraryapp.assignment.day6api.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1")
@RestController
public class FruitController {

    @Autowired
    FruitService fruitService;

    @PostMapping("/fruit")
    public void fruitCreate(@RequestBody FruitRequest request) {
        fruitService.save(request);
    }

    @PutMapping("/fruit")
    public ResponseEntity<String> fruitDelete(@RequestBody FruitRequest request){
        try {
            fruitService.save(request);
        } catch ( RuntimeException e) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok("정상 처리 되었습니다.");
    }

    @GetMapping("/fruit/stat")
    public FruitSalesResponse sales() {
        return fruitService.findFruitSales();
    }
}
