package lk.ijse.spring.controller;


import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/customer")
@CrossOrigin//this will handle all the cross policy errors
public class CustomerController {


    @PostMapping
    public ResponseUtil saveCustomer(@ModelAttribute CustomerDTO dto){
        System.out.println(dto.toString());
        return new ResponseUtil("200",dto.toString()+ " Added",null);
    }

    @PutMapping
    public ResponseUtil updateCustomer(@RequestBody CustomerDTO dto){
        System.out.println(dto.toString());
        return new ResponseUtil("200",dto.toString()+" Updated",null);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteCustomer(String id){
        System.out.println(id);
        return new ResponseUtil("200",id+" Deleted",null);
    }

    @GetMapping
    public ResponseUtil getAllCustomer(){
        ArrayList<CustomerDTO> allCustomers= new ArrayList<>();
        allCustomers.add(new CustomerDTO("C001","Kasun","Galle",1000));
        allCustomers.add(new CustomerDTO("C002","Ramal","Panadura",2000));
        allCustomers.add(new CustomerDTO("C003","Yasith","Kaluthara",3000));
        allCustomers.add(new CustomerDTO("C004","Ranuka","Bandarawela",4000));
        return new ResponseUtil("200"," Success",allCustomers);
    }
}
