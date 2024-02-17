package com.cz.libraryapp.assignment.day2api.problem1;

import lombok.Getter;

@Getter
public class Operation {

    private final int add;
    private final int minus;
    private final int multiply;

    public Operation(OperationRequest request) {
        this.add = request.number1() + request.number2();
        this.minus = request.number1() - request.number2();
        this.multiply = request.number1() * request.number2();
    }
}
