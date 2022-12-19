package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

@Component("item")//change bean id
public class ItemController {

    public ItemController(){
        System.out.println("Item Controller: Instantiated");
    }
}
