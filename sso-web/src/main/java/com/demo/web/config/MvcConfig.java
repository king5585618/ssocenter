package com.demo.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.velocity.VelocityViewResolver;

/**
 * Created by jinzj on 2017/1/18.
 */
@Configuration
@EnableWebMvc
@EnableScheduling
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        super.configureViewResolvers(registry);
        registry.viewResolver(viewResolver());
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    public VelocityViewResolver viewResolver(){
        VelocityViewResolver resolver = new VelocityViewResolver();
        resolver.setPrefix("/");
        resolver.setSuffix(".vm");
        resolver.setOrder(1);
        return resolver;
    }
}
