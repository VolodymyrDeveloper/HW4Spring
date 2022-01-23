package com.pasichnyk.xmlConfigurationMethod;

public class Calculator1 {

    private MinusService minusService;
    private PlusService plusService;

    public Calculator1(MinusService minusService, PlusService plusService) {
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
