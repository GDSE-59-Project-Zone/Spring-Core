package lk.ijse.spring.controller;


import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
@CrossOrigin//this will handle all the cross policy errors
public class CustomerController {


    @PostMapping
    public String saveCustomer(CustomerDTO dto){
        System.out.println(dto.toString());
        return "Customer Added";
    }
}
