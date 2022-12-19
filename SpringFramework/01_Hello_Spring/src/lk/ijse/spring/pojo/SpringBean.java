package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class SpringBean { //bean id springBean
    public SpringBean(){
        System.out.println("Spring Bean : Instantiated");
    }

    public void test(){
        System.out.println("Spring Bean Test Method Invoked");
    }
}
