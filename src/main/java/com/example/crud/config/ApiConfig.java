package com.example.crud.config;

import com.example.crud.mapper.RecordMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfig {

    @Bean
    protected RecordMapper recordMapper() {
        return Mappers.getMapper(RecordMapper.class);
    }
}