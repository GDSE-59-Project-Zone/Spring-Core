package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.pojo")
@Import({ConfigOne.class,ConfigTwo.class})
//@ImportResource("file:appconfig.xml")
//@ImportResource("classpath:appconfig.xml")
public class AppConfig {
    public AppConfig(){
        System.out.println("AppConfig:Instantiated");
    }
}
