package lk.ijse.spring.config;

import lk.ijse.spring.pojo.SBeanThree;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigTwo {
    public ConfigTwo(){
        System.out.println("ConfigTwo:Instantiated");
    }

    @Bean
    public SBeanThree beanThree(){
        return new SBeanThree();
    }
}
