package ye.guo.huang.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ye.guo.huang.service.UserService;

@Configuration
public class UserConf {
    @Bean
    public UserService userService(){
        return new UserService();
    }
}
