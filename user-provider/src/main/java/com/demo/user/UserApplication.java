package com.demo.user;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zlb
 * @since 4/22/22 9:35 PM
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.demo.user.service")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
