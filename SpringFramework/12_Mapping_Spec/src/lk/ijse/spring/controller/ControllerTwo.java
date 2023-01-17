package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/two")
public class ControllerTwo {
    //Exact Mapping

    //if there is an ambiguous mapping
    //path = url/customer/m2/m3
    //path segments = customer,m2,m3

    @GetMapping
    public String defaultGet() {
        return "Default Get Mapping Invoked";
    }


    @GetMapping(path = "/m1")
    public String methodOne() {
        return "Get Mapping One Invoked";
    }

    @GetMapping(path = "/m2")
    public String methodTwo() {
        return "Get Mapping Two Invoked";
    }

    @GetMapping(path = "/m3")
    public String methodThree() {
        return "Get Mapping Three Invoked";
    }

    @GetMapping(path = "/m3/m4")
    public String methodFour() {
        return "Get Mapping Four Invoked";
    }

    //how to access the path segments values in spring
    @GetMapping(path = "/m5/no/{C001}")
    public String methodFive(@PathVariable("C001") String id) {
        return "Get Mapping Four Invoked : "+id;
    }


}
