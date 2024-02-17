package com.cz.libraryapp.assignment.annotation;

import java.lang.reflect.Method;

public class AnnotationUtil {
    static int calculateSumForAnnotation(Class<?> clazz, String methodName) throws NoSuchMethodException {
        int sum = 0;
        Method method = clazz.getMethod(methodName);
        AnnotationCal annotationCal = method.getAnnotation(AnnotationCal.class);
        for (int number : annotationCal.numbers()) {
            sum += number;
        }
        return sum;
    }
}
