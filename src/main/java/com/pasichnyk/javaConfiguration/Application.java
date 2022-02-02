package com.pasichnyk.javaConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Calculator calculator3 = context.getBean("calculator3", Calculator.class);

        System.out.println(calculator3.calculate(5, 10));


    }

}
