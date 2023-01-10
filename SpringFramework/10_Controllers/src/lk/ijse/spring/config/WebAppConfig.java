package lk.ijse.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
@EnableWebMvc
public class WebAppConfig {

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver rsv = new InternalResourceViewResolver();
        rsv.setPrefix("/WEB-INF/views/");
        rsv.setSuffix(".jsp");
        return rsv;
    }
}
