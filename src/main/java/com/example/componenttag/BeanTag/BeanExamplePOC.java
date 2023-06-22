package com.example.componenttag.BeanTag;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanExamplePOC {
    @Bean
    public String examplePOC() {
        return "I'm a Bean";
    }
}
