package com.cz.libraryapp.assignment.day4api;

import lombok.Getter;

@Getter
public class FruitSalesResponse {
    private final long salesAmount;
    private final long notSalesAmount;

    public FruitSalesResponse(long salesAmount, long notSalesAmount) {
        this.salesAmount = salesAmount;
        this.notSalesAmount = notSalesAmount;
    }
}
