package lk.ijse.spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PojoOne  implements InitializingBean {

    @Value("${os.name}")
    private String myOSName;
    @Value("${LOGNAME}")//${} property placeholder
    private String myLogName;

    @Value("${my.project}")
    private String myProjectName;

    @Value("${project.option}")
    private String option;

    public PojoOne(){
        System.out.println("PojoOne:Instantiated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(myOSName);
        System.out.println(myLogName);
        System.out.println(myProjectName);
        System.out.println(option);
    }
}
