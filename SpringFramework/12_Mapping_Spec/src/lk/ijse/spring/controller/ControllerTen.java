package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ten")
public class ControllerTen {


    //Query Param = works
    //form-data = works

    //@Model Attribute (not a required attribute)
    // We can catch query string data and x-www-form-url-encoded type data
    //with Model attributes

    @PostMapping
    public String testTwo(@ModelAttribute CustomerDTO dto){
        return "Test One Invoked Post Mapping "+dto.toString();
    }




}
