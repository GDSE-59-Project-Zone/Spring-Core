package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
@RequestMapping("/eleven")
public class ControllerEleven {

    //Receive Json Data
    //RequestBody (required annotation)

    @PostMapping
    public CustomerDTO testTwo(@RequestBody CustomerDTO dto){
       return dto;
    }

    @GetMapping
    public ArrayList<CustomerDTO> testTwo(){
        ArrayList<CustomerDTO> customers = new ArrayList<>();
        customers.add(new CustomerDTO("C001","Dasun","Galle",1000));
        customers.add(new CustomerDTO("C002","Ramal","Galle",1000));
        customers.add(new CustomerDTO("C003","Ravindu","Galle",1000));
        customers.add(new CustomerDTO("C004","Kasun","Galle",1000));
        return customers;
    }




}
