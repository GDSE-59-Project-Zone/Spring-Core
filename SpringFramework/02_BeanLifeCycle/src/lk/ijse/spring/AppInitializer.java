package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.SpringBeanOne;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {



        AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        //Let's request spring bean One from container
        SpringBeanOne bean = ctx.getBean(SpringBeanOne.class);
        System.out.println(bean);


        //Run Something just before jvm is going to shut-down (Hooking Process)
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                ctx.close();
            }
        }));
        //Spring Alternative for above code
        ctx.registerShutdownHook();


        SpringBeanOne bean2 = ctx.getBean(SpringBeanOne.class);
        System.out.println(bean2);


    }
}
