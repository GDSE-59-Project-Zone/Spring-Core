package lk.ijse.spring.service.impl;

import lk.ijse.spring.config.WebRootConfig;
import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.transaction.Transactional;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@WebAppConfiguration
@ContextConfiguration(classes = {WebRootConfig.class}) // for test context configurations
@ExtendWith(SpringExtension.class)
@Transactional
class CustomerServiceImplTest {

    @Autowired
    public CustomerService customerService;
    @Test
    public void testCustomerSave(){
        //If I try to add existing customer. if validation work there should be an error
        CustomerDTO customerDTO1 = new CustomerDTO("C001","Dasun Anjana","Galle",2000);

        assertThrows(RuntimeException.class,()->{
            //This test case will be ok if line thorws an error
            customerService.addCustomer(customerDTO1);
        });


        //let's enter valid data and then check there are errors or not
        CustomerDTO customerDTO2 = new CustomerDTO("C008","Dasun Anjana","Galle",2000);
        assertDoesNotThrow(()->{
            //this test case will be ok if this line does not throw an error
            customerService.addCustomer(customerDTO2);
        });
    }

}