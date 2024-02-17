package com.cz.libraryapp.controller;

import com.cz.libraryapp.dto.calculator.request.CalculatorAddRequest;
import com.cz.libraryapp.dto.calculator.request.CalculatorMultiplyRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/add")
    public int addTwoNumbers(CalculatorAddRequest request){
        return request.number1() + request.number2();
    }

    @GetMapping("multiply")
    public int multiplyTwoNumbers(CalculatorMultiplyRequest request){
        return request.number1() * request.number2();
    }
}
