package com.pasichnyk.xmlAndAnnotationMethod;

import org.springframework.stereotype.Component;

@Component("minus")
public class MinusService {

    double minus(double a, double b) {
        return a - b;
    }
}
