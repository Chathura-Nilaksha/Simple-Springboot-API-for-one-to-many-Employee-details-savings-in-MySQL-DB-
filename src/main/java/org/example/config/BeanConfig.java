package org.example.config;

import org.example.entity.AddressEntity;
import org.example.repository.AddressRepository;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public ModelMapper makeModelMapperObject(){
        return new ModelMapper();
    }

}
