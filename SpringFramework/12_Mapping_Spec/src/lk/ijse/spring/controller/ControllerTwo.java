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
    //http://localhost:8080/mapping/two/m5/no/C001
    @GetMapping(path = "/m5/no/{C001}/{ijse}")
    public String methodFive(@PathVariable("C001") String id,@PathVariable("ijse") String name) {
        return "Get Mapping Four Invoked : "+id;
    }

    //http://localhost:8080/mapping/two/id/D001/IJSE
    //if the path segment name and method parameter name is equal there is no need to put an alies
    @GetMapping(path = "/id/{id}/{name}")
    public String methodSix(@PathVariable String id,@PathVariable String name) {
        return "Get Mapping Four Invoked : "+id+" "+name;
    }


    //furthermore we can validate a path variable as we want using regex
    //() grouping syntax in regex not working properly here
    @GetMapping(path = "/name/{name:[A-Z]{4}}/{id:[C]{1}[0-9]{3}}")
    public String methodSeven(@PathVariable String name,@PathVariable String id) {
        return "Get Mapping Four Invoked : "+id+" : " +name;
    }


}
