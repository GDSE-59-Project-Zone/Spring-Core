package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class A {

    private B b;

    public A(){
        System.out.println("Instantiated: A");
    }

    public void sendRequestForB(){
    b.callMe();
    }
}
