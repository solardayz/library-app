package com.cz.libraryapp.assignment.annotation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;

@RestController
public class AnnotationCalculator {

    @GetMapping("/annotationSum")
    @AnnotationCal(numbers = {1, 2, 3, 4, 5})
    public int annotationSum() throws NoSuchMethodException, ClassNotFoundException {
        return AnnotationUtil.calculateSumForAnnotation(getClass(), "annotationSum");
    }

    /*
    * 어노테이션을 사용하는 이유 : 복잡한 로직을 어노테이션 하나로 간단하게 사용할 수 있다.
    * 위의 코드는 어노테이션이 숫자를 입력하면 해당 숫자를 모두 더해주는 나만의 합계 어노테이션이다.
    */

}
