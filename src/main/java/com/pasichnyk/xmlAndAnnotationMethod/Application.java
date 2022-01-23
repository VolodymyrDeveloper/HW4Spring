package com.pasichnyk.xmlAndAnnotationMethod;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Calculator2 calculator2 = context.getBean("calc", Calculator2.class);

        System.out.println(calculator2.calculate(5, 4));

    }

}
