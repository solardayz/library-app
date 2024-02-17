package com.cz.libraryapp.assignment.day2api.problem1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class OperationController {

    @GetMapping("/operation")
    public Operation operation(OperationRequest request) {
        return new Operation(request);
    }
}
