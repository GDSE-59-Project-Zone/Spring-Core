package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class B implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public B(){
        System.out.println("Instantiated: B");
    }

    public void callMe(){
        System.out.println("Received the call");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory Aware: A");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name Aware: A");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Disposable Bean: A");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean: A");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context Aware: A");
    }
}
