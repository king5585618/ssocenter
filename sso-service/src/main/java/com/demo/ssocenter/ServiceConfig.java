package com.demo.ssocenter;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by jinzj on 2017/1/20.
 */
@Configuration
@Profile("!production")
@ImportResource(locations = {"classpath:datasource.xml"})
@EnableJpaRepositories(value = "com.demo.ssocenter.repository")
@EnableWebMvc
public class ServiceConfig extends WebMvcConfigurerAdapter {
}
