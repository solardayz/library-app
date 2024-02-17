package com.cz.libraryapp.assignment.day2api.problem2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Slf4j
@RequestMapping("/api/v1")
@RestController
public class DayOfTheWeekController {

    @GetMapping("/day-of-the-week")
    DayOfTheWeek dayOfTheWeek(@RequestParam("date") String date) {

        log.info("dataString =[{}]", date);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateFormat = LocalDate.parse(date, dateTimeFormatter);

        DayOfWeek dayOfWeek = dateFormat.getDayOfWeek();

        return new DayOfTheWeek(String.valueOf(dayOfWeek));
    }
}
