package com.demo.ssocenter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * Created by jinzj on 2017/1/20.
 */
@Configuration
public class ShiroConfig {

    @Autowired
    private Environment env;
}
