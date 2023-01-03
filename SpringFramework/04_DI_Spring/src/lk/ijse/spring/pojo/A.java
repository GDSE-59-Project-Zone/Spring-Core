package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class A implements DI,BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

//    @Autowired // if we satisfied the dependency through the property that is called as property injection
//    @Qualifier("c")
    private BSuper m;

    //DI Methods (Inversion of Control)
    //01. Property Injection
    //02. Constructor Injection
    //03. Setter method Injection
    //04. Interface through Injection


//    @Autowired
//    public A(BSuper bb){
//        //Constructor Injection (If we set the dependency injection through constructor)
//        this.m=bb;
//        System.out.println("Instantiated: A");
//    }

    public void sendRequestForB(){
    m.callMe();
    }

//    @Autowired
//    public void setInjection(BSuper bb){
//        //if we set a dependency of a class through setter method
//        this.m=bb;
//    }

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

    @Autowired
    @Override
    public void setInjection(BSuper bb) {
        //Interface through Injection method in DI
        //Apply DI through Loos Coupling
        this.m=bb;
    }
}
