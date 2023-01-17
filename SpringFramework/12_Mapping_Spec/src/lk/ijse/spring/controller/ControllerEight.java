package lk.ijse.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eight")
public class ControllerEight {


    //There are two types for a request
    //01. Headers (Meta Data)
        //Content-Type (What is the content type of request body)
        //Accept (What should be the response type for the request response)
    //02. Body (Content)
            //formats
            //JSON
            //Query String
            //x-www-form-url-encoded (form data)

    //consume types (what the request hopes to consume with the request) (Content-Type)
    //produce types (what should be the response type for the request) (Accept)

    //to match this the request sender should send Content-Type header
    //with the value of application/json
    @GetMapping(consumes = {"application/json"},produces = {MediaType.APPLICATION_JSON_VALUE})
    public String testOne(){
        return "Test One Invoked";
    }


    //to match this the request sender should send Content-Type header
    //with the value of text/html
    @GetMapping(produces = {"text/html"})
    public String testTwo(){
        return "Test Two Invoked ";
    }


    //we can alternate the above method with the following approach
    //headers
    @GetMapping(headers = {"Content-Type=application/json","Accept=text/html"})
    public String testThree(){
        return "Test Two Invoked ";
    }
}
