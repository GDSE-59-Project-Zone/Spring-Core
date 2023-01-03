package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class B {
    public B(){
        System.out.println("Instantiated: B");
    }

    public void callMe(){
        System.out.println("Received the call");
    }
}
