package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/eleven")
public class ControllerEleven {

    //Receive Json Data
    //RequestBody (required annotation)

    @PostMapping
    public CustomerDTO testTwo(@RequestBody CustomerDTO dto){
        return dto;
    }




}
