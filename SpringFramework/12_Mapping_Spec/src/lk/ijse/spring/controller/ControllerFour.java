package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/four")
public class ControllerFour {

    //Wild Card Mapping
    //matches one or more characters inside a path segment
    @GetMapping(path = "/one/*/two")
    public String testOne(){
        return "Test One Method";
    }

    @GetMapping(path = "/two/one/*/last")
    public String testTwo(){
        return "Test Two Method";
    }
}
