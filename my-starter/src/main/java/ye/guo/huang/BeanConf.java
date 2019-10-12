package ye.guo.huang;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConf {
    @Bean(name = "starService")
    public StarService starService(){
        StarService starService = new StarService();
        return starService;
    }

}
