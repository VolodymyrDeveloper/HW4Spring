package com.pasichnyk.xmlConfigurationMethod;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");

        Calculator1 calculator = (Calculator1) beanFactory.getBean("calculator");

        System.out.println(calculator.calculate(3, 5));

    }

}
