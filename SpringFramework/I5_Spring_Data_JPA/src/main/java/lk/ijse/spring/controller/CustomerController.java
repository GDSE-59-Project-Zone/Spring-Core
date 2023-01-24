package lk.ijse.spring.controller;


import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.util.ResponseUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customer")
@CrossOrigin//this will handle all the cross policy errors
public class CustomerController {



    @PostMapping
    public ResponseUtil saveCustomer(@ModelAttribute CustomerDTO dto){

        return new ResponseUtil("200",dto.toString()+ " Added",null);
    }

    @PutMapping
    public ResponseUtil updateCustomer(@RequestBody CustomerDTO dto){

        return new ResponseUtil("200",dto.toString()+" Updated",null);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteCustomer(String id){

        return new ResponseUtil("200",id+" Deleted",null);
    }

    @GetMapping
    public ResponseUtil getAllCustomer(){

        return new ResponseUtil("200"," Success",all);
    }
}
