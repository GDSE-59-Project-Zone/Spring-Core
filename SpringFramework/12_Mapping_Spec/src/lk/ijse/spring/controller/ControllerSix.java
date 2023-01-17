package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/six")
public class ControllerSix {

    //mapping with query parameters
    //we can narrow down spring request using Query params
    //We can use @RequestParam annotation to catch query parameters values

    //http://localhost:8080/mapping/six?id=C001
    //id, name
    @GetMapping(params = {"id","name"})
    public String testOne(@RequestParam("id") String myID,@RequestParam String name){
        return "Test One Invoked" +myID+" : "+name;
    }

    //address,salary
    @GetMapping(params = {"address","salary"})
    public String testTwo(String address,String salary){
        return "Test Two Invoked " +address+" : "+salary;
    }
}
