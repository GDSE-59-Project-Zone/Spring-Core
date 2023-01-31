package lk.ijse.spring.repo;

import lk.ijse.spring.config.WebAppConfig;
import lk.ijse.spring.config.WebRootConfig;
import lk.ijse.spring.controller.CustomerController;
import lk.ijse.spring.entity.Customer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@WebAppConfiguration
@ContextConfiguration(classes = {WebRootConfig.class}) // for test context configurations
@ExtendWith(SpringExtension.class)
class CustomerRepoTest {

    @Autowired
    CustomerRepo customerRepo;


    @Test
    public void addCustomer(){
        Customer customer = new Customer("C004","Dasun Perera","Galle",new BigDecimal(100));
        customerRepo.save(customer);
    }


    @Test
    public void testOne() {
        List<Customer> dasunPerera = customerRepo.findByName("Dasun Perera");
        for (Customer customer : dasunPerera) {
            System.out.println(customer.toString());
        }
    }

    @Test
    public void testTwo() {
        Customer data = customerRepo.findByNameAndAddress("Thamalsha","Mathara");
        System.out.println(data.toString());
    }


    @Test
    public void testThree() {
//        Customer data1 = customerRepo.findByName("Thamalsha");
        Customer data2 = customerRepo.readByName("Thamalsha");
        Customer data3 = customerRepo.getByName("Thamalsha");
        Customer data4 = customerRepo.queryByName("Thamalsha");
        Customer data5 = customerRepo.searchByName("Thamalsha");
        Customer data6 = customerRepo.streamByName("Thamalsha");
//        System.out.println(data1.toString());
        System.out.println(data2.toString());
        System.out.println(data3.toString());
        System.out.println(data4.toString());
        System.out.println(data5.toString());
        System.out.println(data6.toString());
    }

    @Test
    public void testFour() {
        Long count = customerRepo.countByName("Dasun Perera");
        System.out.println(count);
    }

    @Test
    public void testFive() {
        Boolean response = customerRepo.existsByAddress("Galle");
        System.out.println(response);
    }

}