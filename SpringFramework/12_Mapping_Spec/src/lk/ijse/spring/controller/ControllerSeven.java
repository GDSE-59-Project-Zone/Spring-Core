package lk.ijse.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seven")
public class ControllerSeven {


    //There are two types for a request
    //01. Headers (Meta Data)
    //02. Body (Content)
            //formats
            //JSON
            //Query String
            //x-www-form-url-encoded (form data)

    //consume types (what the request hopes to consume with the request)
    //produce types

    //to match this the request sender should send Content-Type header
    //with the value of application/json
    @GetMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public String testOne(){
        return "Test One Invoked";
    }


    //to match this the request sender should send Content-Type header
    //with the value of text/html
    @GetMapping(consumes = {"text/html"})
    public String testTwo(){
        return "Test Two Invoked ";
    }
}
