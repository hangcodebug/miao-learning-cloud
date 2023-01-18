package com.miao.base.config;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author miao
 * @version 1.0.0
 * @description 时间 序列化
 * @title LocalDateTimeConfig
 * @date 2023/1/18 17:41
 */
@Configuration
public class LocalDateTimeConfig {
    /**
     * 序列化内容
     * LocalDataTime -> String
     * 服务端返回给前端
     */
    @Bean
    public LocalDateTimeSerializer localDateTimeSerializer(){
        return new LocalDateTimeSerializer(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
    /**
     * 反序列化内容
     * String -> LocalDateTime
     * 客户端传入服务端
     */
    @Bean
    public LocalDateTimeDeserializer localDateTimeDeserializer(){
        return new LocalDateTimeDeserializer(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    @Bean
    public Jackson2ObjectMapperBuilderCustomizer jackson2ObjectMapperBuilderCustomizer(){
        return builder ->{
            builder.serializerByType(LocalDateTime.class,localDateTimeSerializer());
            builder.deserializerByType(LocalDateTime.class,localDateTimeDeserializer());
        };
    }
}
