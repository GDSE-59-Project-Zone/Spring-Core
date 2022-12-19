package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.BasicDataSource;
import lk.ijse.spring.pojo.DbConnection;
import lk.ijse.spring.pojo.ItemController;
import lk.ijse.spring.pojo.SpringBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.*;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();

        //There should at least one Config class to a Spring Container
        ctx.register(AppConfig.class);
        ctx.refresh();


        //Context invocation
        SpringBean bean1 = ctx.getBean(SpringBean.class);
        bean1.test();
        System.out.println(bean1);

        DbConnection bean = ctx.getBean(DbConnection.class);
        System.out.println(bean);
        bean.getConnection();


        BasicDataSource bean3 = ctx.getBean(BasicDataSource.class);
        BasicDataSource bean4 = ctx.getBean(BasicDataSource.class);
        System.out.println(bean3);//singleton
        System.out.println(bean4);//singleton
        bean3.accessPool();

        //What are the methods of context invocation
        //01. Class Type
        BasicDataSource bds = ctx.getBean(BasicDataSource.class);
        System.out.println(bds);

        //02. Bean ID
        SpringBean bean5 = (SpringBean) ctx.getBean("springBean");
        System.out.println(bean5);

        //How bean id generated
        //@Component SpringBean - > springBean

        //@Bean -> bean id..? use the bean method name
        BasicDataSource cds2 = (BasicDataSource) ctx.getBean("basicDataSource");
        System.out.println(cds2);


        //can we change the bean id
        ItemController item= (ItemController) ctx.getBean("item");
        System.out.println(item);

        ctx.close();

    }
}
