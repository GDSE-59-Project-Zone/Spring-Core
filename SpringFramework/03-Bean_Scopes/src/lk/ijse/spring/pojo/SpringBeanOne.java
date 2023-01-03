package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SpringBeanOne implements BeanNameAware,BeanFactoryAware, ApplicationContextAware, InitializingBean,DisposableBean {

    public SpringBeanOne(){
        System.out.println("SpringBeanOne : Instantiated");
    }


    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name Aware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context Aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean : Bean is ready to use");
    }



    @Override
    public void destroy() throws Exception {
        System.out.println("SpringBeanOne : Destroyed");
    }
}
