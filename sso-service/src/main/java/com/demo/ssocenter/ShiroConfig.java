package com.demo.ssocenter;

import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.apache.shiro.web.session.mgt.WebSessionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jinzj on 2017/1/20.
 */
@Configuration
public class ShiroConfig {

    @Bean(name = "defaultWebSessionManager")
    public WebSessionManager getDefaultWebSessionManager(){
        DefaultWebSessionManager manager = new DefaultWebSessionManager();
        manager.setSessionIdCookieEnabled(true);
        return manager;
    }

    @Bean(name = "defaultSecurityManager")
    public DefaultSecurityManager getDefaultSecurityManager() {
        DefaultSecurityManager manager = new DefaultSecurityManager();
        manager.setSessionManager(getDefaultWebSessionManager());
        //需要加个性化的realm
        return manager;
    }

}
