package lk.ijse.spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PojoTwo implements InitializingBean {

    @Value("Panadura")
    private String myAddress;

    public PojoTwo(){
        System.out.println("PojoTwo:Instantiated");
        System.out.println(myAddress);//null. because bean is still processing at the moment
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(myAddress);
    }
}
