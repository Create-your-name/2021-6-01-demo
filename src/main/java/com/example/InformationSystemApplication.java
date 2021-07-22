package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
public class InformationSystemApplication {

    public static void main(String[] args) {

        SpringApplication.run(InformationSystemApplication.class, args);
        System.out.println("http://localhost:8080");
    }

}