package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class DbConnection {
    public DbConnection(){
        System.out.println("DBConnection : Instantiated");
    }

    public void getConnection(){
        System.out.println("Returned Connection");
    }
}
