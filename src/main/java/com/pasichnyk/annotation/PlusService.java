package com.pasichnyk.annotation;

import org.springframework.stereotype.Component;

@Component("plus")
public class PlusService {

    double plus(double a, double b) {
        return a + b;
    }
}
