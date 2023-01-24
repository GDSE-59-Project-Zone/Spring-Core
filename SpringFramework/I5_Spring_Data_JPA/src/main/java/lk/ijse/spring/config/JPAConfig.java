package lk.ijse.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;

@Configuration
public class JPAConfig {

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource ds, JpaVendorAdapter jpa){
        LocalContainerEntityManagerFactoryBean bean= new LocalContainerEntityManagerFactoryBean();
        bean.setPackagesToScan("lk.ijse.spring.entity");
        bean.setDataSource(ds);
        bean.setJpaVendorAdapter(jpa);
        return bean;
    }

    @Bean
    public DataSource dataSource(){
        //we use this data source only for testing purposes (Development)
        //if we are in (Production) we can use a DBCP pool
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/spring_jpa?createDatabaseIfNotExist=true");
        ds.setUsername("root");
        ds.setPassword("sanu1234");
        return ds;
    }

}
