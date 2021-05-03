package com.jrock.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableEurekaClient // Eureka Client neflix 꺼
@EnableDiscoveryClient // spring cloud 꺼
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    @LoadBalanced // 이 것을 넣으면 RestTemplate 설정할 때 유레카에 등록 되어있는 아이디로 등록이 가능하다. ex) http://127.0.0.1:8000/order-service -> http://ORDER-SERVICE/order-service
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
