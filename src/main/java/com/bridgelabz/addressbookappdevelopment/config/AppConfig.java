package com.bridgelabz.addressbookappdevelopment.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Layer that maps Java Beans from one representation to other
 * @author - Sakshi Shetty
 * @version - 0.0.1
 * @since - 13/10/2021
 */

@Configuration
public class AppConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
