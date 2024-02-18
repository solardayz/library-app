package com.cz.libraryapp.assignment.day6api.model;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Fruit {
    private final long id;
    private final String name;
    private final LocalDate warehousingDate;
    private final long price;
    private final Boolean saleYn;

    public Fruit(long id, String name, LocalDate warehousingDate, long price, Boolean saleYn) {
        this.id = id;
        this.name = name;
        this.warehousingDate = warehousingDate;
        this.price = price;
        this.saleYn = saleYn;
    }
}
