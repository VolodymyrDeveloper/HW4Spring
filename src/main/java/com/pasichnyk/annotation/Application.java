package com.pasichnyk.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Calculator calculator2 = context.getBean("calc", Calculator.class);

        System.out.println(calculator2.calculate(5, 4));

    }

}
