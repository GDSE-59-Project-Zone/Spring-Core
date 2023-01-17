package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ten")
public class ControllerTen {




    //Query Param = works
    //form-data = works
    @PostMapping
    public String testTwo(CustomerDTO dto){
        return "Test One Invoked Post Mapping "+dto.toString();
    }



}
