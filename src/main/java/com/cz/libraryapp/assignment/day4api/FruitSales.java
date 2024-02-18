package com.cz.libraryapp.assignment.day4api;

import lombok.Getter;

@Getter
public class FruitSales {
    private final long salesAmount;
    private final long notSalesAmount;

    public FruitSales(long salesAmount, long notSalesAmount) {
        this.salesAmount = salesAmount;
        this.notSalesAmount = notSalesAmount;
    }
}
