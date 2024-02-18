package com.cz.libraryapp.assignment.day6api.model;

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
