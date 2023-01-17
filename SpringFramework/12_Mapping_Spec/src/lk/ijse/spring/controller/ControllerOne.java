package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/one")
public class ControllerOne {

    @GetMapping
    public String testOne(){
        System.out.println("Get Mapping Invoked");
        return "Get Mapping Was Invoked";
    }

    @PostMapping
    public String testTwo(){
        System.out.println("Post Mapping Invoked");
        return "Post Mapping Was Invoked";
    }

    @DeleteMapping
    public String testThree(){
        System.out.println("Delete Mapping Invoked");
        return "Delete Mapping Was Invoked";
    }

    @PutMapping
    public boolean testFour(){
        System.out.println("Put Mapping Invoked");
        return false; // need converters
    }
}
