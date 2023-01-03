package lk.ijse.spring.config;

import lk.ijse.spring.Bean.SpringBeanThree;
import lk.ijse.spring.pojo.SpringBeanOne;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
public class AppConfig {
}
