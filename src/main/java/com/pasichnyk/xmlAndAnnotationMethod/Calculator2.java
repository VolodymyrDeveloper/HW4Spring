package com.pasichnyk.xmlAndAnnotationMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("calc")
public class Calculator2 {

    private MinusService minusService;
    private PlusService plusService;

    @Autowired
    public Calculator2(MinusService minusService,
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
