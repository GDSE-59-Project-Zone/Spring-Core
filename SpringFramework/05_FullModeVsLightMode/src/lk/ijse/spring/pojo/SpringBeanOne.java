package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBeanOne(){
        System.out.println("SpringBeanOne: Instantiated");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory Aware: SpringBeanOne");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name Aware: SpringBeanOne");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Disposable Bean: SpringBeanOne");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean: SpringBeanOne");
        System.out.println("======================");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context Aware: SpringBeanOne");
    }


    //Light Mode
    @Bean
    public SpringBeanTwo beanTwo(){
        //Inter-bean dependencies
        SpringBeanThree b1 = beanThree(); //inter-bean dependency invocation
        SpringBeanThree b2 = beanThree();
        System.out.println(b1);
        System.out.println(b2);
        return new SpringBeanTwo();
    }

    @Bean
    public SpringBeanThree beanThree(){
        return new SpringBeanThree();
    }
}
