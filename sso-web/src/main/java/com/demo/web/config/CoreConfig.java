package com.demo.web.config;

import com.demo.ssocenter.ServiceConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by jinzj on 2017/1/18.
 */
@Configuration
@ComponentScan("com.demo.web.controller")
@Import({
        ServiceConfig.class
})
public class CoreConfig {

}
