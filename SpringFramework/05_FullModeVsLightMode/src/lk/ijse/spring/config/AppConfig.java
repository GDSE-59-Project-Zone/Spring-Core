package lk.ijse.spring.config;

import lk.ijse.spring.pojo.SpringBeanOne;
import lk.ijse.spring.pojo.SpringBeanThree;
import lk.ijse.spring.pojo.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
public class AppConfig { // a source a spring bean definitions

    @Bean
    public SpringBeanTwo beanTwo(){
        //Inter-bean dependencies
        SpringBeanThree b1 = beanThree(); //inter-bean dependency invocation
        System.out.println(b1);
        return new SpringBeanTwo();
    }

    @Bean
    public SpringBeanThree beanThree(){
        return new SpringBeanThree();
    }


}
