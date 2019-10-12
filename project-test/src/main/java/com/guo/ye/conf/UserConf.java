package com.guo.ye.conf;

import com.guo.ye.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConf {
    @Bean
    public UserService userService(){
        UserService userService = new UserService();
        return userService ;
    }
}
