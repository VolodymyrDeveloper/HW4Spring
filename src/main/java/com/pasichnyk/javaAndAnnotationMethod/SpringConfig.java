package com.pasichnyk.javaAndAnnotationMethod;

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
    public Calculator3 calculator3() {
        return new Calculator3(minusService(), plusService());
    }
}
