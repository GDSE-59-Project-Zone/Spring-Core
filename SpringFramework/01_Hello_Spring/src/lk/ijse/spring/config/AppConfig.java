package lk.ijse.spring.config;

import lk.ijse.spring.pojo.BasicDataSource;
import lk.ijse.spring.pojo.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
public class AppConfig {
    public AppConfig(){
        System.out.println("App Config : Instantiated");
    }

    //This is how to introduce a bean to container when the
    //class not belongs to you
    @Bean
    public BasicDataSource basicDataSource(){
        return new BasicDataSource();
    }

    @Bean(name = "beantwo") // change the default id
    public SpringBeanTwo springBeanTwo(){
        return new SpringBeanTwo();
    }

}
