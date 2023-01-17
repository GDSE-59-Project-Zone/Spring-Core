package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/one")
public class ControllerOne {

    @GetMapping
    public String testOne1(){
        System.out.println("Get Mapping  1 Invoked");
        return "Get 1 Mapping Was Invoked";
    }

//    @GetMapping
//    public String testOne2(){
//        System.out.println("Get Mapping 2 Invoked");
//        return "Get 2 Mapping Was Invoked";
//    }

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
