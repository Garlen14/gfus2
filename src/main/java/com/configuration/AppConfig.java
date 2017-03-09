package com.configuration;

import org.hibernate.SessionFactory;
import org.hibernate.ejb.HibernateEntityManagerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Garlen on 05/03/2017.
 */
@Configuration
@ComponentScan(basePackages = {"com.core",
        "com.controller",
        "com.service",
        "com.dao"})
public class AppConfig {




}