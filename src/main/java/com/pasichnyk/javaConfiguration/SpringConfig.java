package com.pasichnyk.javaConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public MinusService minusService() {
        return new MinusService();
    }

    @Bean
    public PlusService plusService() {
        return new PlusService();
    }

    @Bean
    public Calculator calculator3() {
        return new Calculator(minusService(), plusService());
    }
}
