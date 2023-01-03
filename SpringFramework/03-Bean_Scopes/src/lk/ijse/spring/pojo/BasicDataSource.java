package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class BasicDataSource implements BeanNameAware,BeanFactoryAware, ApplicationContextAware, InitializingBean,DisposableBean {

    public BasicDataSource(){
        System.out.println("BasicDataSource : Instantiated");
    }


    @Override
    public void setBeanName(String name) {
        System.out.println("BasicDataSource: Bean Name Aware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BasicDataSource: Bean Factory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("BasicDataSource: Application Context Aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("BasicDataSource : Initializing Bean : Bean is ready to use");
    }



    @Override
    public void destroy() throws Exception {
        System.out.println("BasicDataSource : Destroyed");
    }
}
