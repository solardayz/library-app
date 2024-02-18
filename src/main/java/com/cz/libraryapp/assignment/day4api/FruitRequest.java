package com.cz.libraryapp.assignment.day4api;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
public class FruitRequest {

    private final long id;
    private final String name;
    private final LocalDate warehousingDate;
    private final long price;

    public FruitRequest() {
        this.id = 0;
        this.name = null;
        this.warehousingDate = null;
        this.price = 0;
    }

    public FruitRequest(long id, String name, LocalDate warehousingDate, long price) {
        this.id = id;
        this.name = name;
        this.warehousingDate = warehousingDate;
        this.price = price;
    }
}
