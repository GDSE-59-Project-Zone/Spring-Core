package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class ControllerOne {

    //mapping methods / handler methods
    @GetMapping
    public String getMethod(){
        return "Get Method";
    }
}
