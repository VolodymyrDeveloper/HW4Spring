package com.pasichnyk.xmlConfiguration;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");

        Calculator calculator = (Calculator) beanFactory.getBean("calculator");

        System.out.println(calculator.calculate(3, 5));

    }

}
