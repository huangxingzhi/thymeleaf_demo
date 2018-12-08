package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

    @Bean
    public org.springframework.web.servlet.LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }

}
