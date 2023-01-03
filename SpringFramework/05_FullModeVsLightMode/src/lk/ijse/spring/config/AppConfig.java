package lk.ijse.spring.config;

import lk.ijse.spring.pojo.SpringBeanOne;
import lk.ijse.spring.pojo.SpringBeanThree;
import lk.ijse.spring.pojo.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
public class AppConfig { // a source a spring bean definitions

    //Full Mode
//    @Bean
//    public SpringBeanTwo beanTwo(){
//        //Inter-bean dependencies
//        SpringBeanThree b1 = beanThree(); //inter-bean dependency invocation
//        SpringBeanThree b2 = beanThree();
//        System.out.println(b1);
//        System.out.println(b2);
//        return new SpringBeanTwo();
//    }
//
//    @Bean
//    public SpringBeanThree beanThree(){
//        return new SpringBeanThree();
//    }


}
