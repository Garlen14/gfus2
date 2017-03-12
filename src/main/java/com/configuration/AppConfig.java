package com.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Garlen on 05/03/2017.
 */
@Configuration
@ComponentScan(basePackages = {"com.core",
        "com.controller",
        "com.service"})
public class AppConfig {



}