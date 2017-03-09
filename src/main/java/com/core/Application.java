package com.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Garlen on 19/02/2017.
 */

@SpringBootApplication(scanBasePackages = {"com.configuration"})
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }
}