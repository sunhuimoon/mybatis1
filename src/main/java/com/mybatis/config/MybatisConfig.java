//package com.mybatis.config;
//
//import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @Author cloudlandboy
// * @Date 2019/11/22 下午9:31
// * @Since 1.0.0
// */
//@Configuration
//public class MybatisConfig {
//
//    @Bean
//    public ConfigurationCustomizer mybatisConfigurationCustomizer() {
//        return new ConfigurationCustomizer() {
//            @Override
//            public void customize(org.apache.ibatis.session.Configuration configuration) {
//                configuration.setMapUnderscoreToCamelCase(true);
//            }
//        };
//    }
//}