package com.wseijavaee.movies.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.wseijavaee.movies"})
@EnableJpaRepositories({"com.wseijavaee.movies"})
public class appConfig {
}
