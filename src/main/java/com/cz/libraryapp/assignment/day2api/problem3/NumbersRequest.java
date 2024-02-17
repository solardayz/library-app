package com.cz.libraryapp.assignment.day2api.problem3;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class NumbersRequest {

    private int[] numbers;

    public NumbersRequest(int[] numbers) {
        this.numbers = numbers;
    }
}
