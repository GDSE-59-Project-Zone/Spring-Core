package lk.ijse.spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class DBConnection implements InitializingBean {

    @Value("${db.user.name}")
    private String userName;
    @Value("${db.user.password}")
    private String password;
    @Value("${dbd.user.url}")
    private String url;

    @Autowired
    Environment env;


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(userName);
        System.out.println(password);
        System.out.println(url);

        System.out.println("============");

        String property = env.getProperty("db.user.url");
        System.out.println(property);
        //if the property key is not matching a null will be return

        String value = env.getRequiredProperty("db.user.password");
        System.out.println(value);
        //on this method if the key is not available exception
        //will be throws

    }
}
