package lk.ijse.spring.config;

import lk.ijse.spring.pojo.SBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigOne {

    public ConfigOne(){
        System.out.println("ConfigOne:Instantiated");
    }

    @Bean
    public SBeanTwo beanTwo(){
        return new SBeanTwo();
    }
}
