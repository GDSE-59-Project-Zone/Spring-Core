package lk.ijse.spring.controller;


import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.service.CustomerService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/customer")
@CrossOrigin//this will handle all the cross policy errors
public class CustomerController {

    @Autowired
    private CustomerService service;


    @PostMapping
    public ResponseUtil saveCustomer(@ModelAttribute CustomerDTO dto){
        service.addCustomer(dto);
        return new ResponseUtil("200",dto.toString()+ " Added",null);
    }

    @PutMapping
    public ResponseUtil updateCustomer(@RequestBody CustomerDTO dto){
        service.updateCustomer(dto);
        return new ResponseUtil("200",dto.toString()+" Updated",null);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteCustomer(String id){
        service.deleteCustomer(id);
        return new ResponseUtil("200",id+" Deleted",null);
    }

    @GetMapping
    public ResponseUtil getAllCustomer(){
        ArrayList<CustomerDTO> allCustomers = service.getAllCustomers();
        return new ResponseUtil("200"," Success",allCustomers);
    }
}
