package com.miao.content;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author miao
 * @version 1.0.0
 * @description api 启动入口
 * @title ApiApplication
 * @date 2023/1/18 17:26
 */
@EnableSwagger2Doc
@SpringBootApplication
public class MiaoLearningContentApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(MiaoLearningContentApiApplication.class,args);

    }
}
