package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


public class SpringBeanThree implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBeanThree(){
        System.out.println("SpringBeanThree: Instantiated");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory Aware: SpringBeanThree");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name Aware: SpringBeanThree");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Disposable Bean: SpringBeanThree");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean: SpringBeanThree");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context Aware: SpringBeanThree");
    }
}
