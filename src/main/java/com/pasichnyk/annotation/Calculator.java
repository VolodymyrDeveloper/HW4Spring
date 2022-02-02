package com.pasichnyk.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("calc")
public class Calculator {

    private MinusService minusService;
    private PlusService plusService;

    @Autowired
    public Calculator(MinusService minusService,
                      PlusService plusService) {
        this.minusService = minusService;
        this.plusService = plusService;
    }

    public double calculate(double a, double b) {
        if (a > b) {
            return minusService.minus(a, b);
        } else {
            return plusService.plus(a, b);
        }
    }
}
