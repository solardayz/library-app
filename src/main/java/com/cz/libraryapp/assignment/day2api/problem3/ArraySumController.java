package com.cz.libraryapp.assignment.day2api.problem3;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RequestMapping("/api/v1")
@RestController
public class ArraySumController {

    @PostMapping("/sum")
    public int sum(@RequestBody NumbersRequest request){
//        int sum = 0;
//        for (int number : request.getNumbers()) {
//            sum += number;
//        }

        return Arrays.stream(request.getNumbers()).sum();
    }
}
