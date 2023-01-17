package lk.ijse.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/nine")
public class ControllerNine {

//    @PostMapping
//    public String testOne(HttpServletRequest request){
//        String id = request.getParameter("id");
//        return "Test One Invoked "+id;
//    }


    //Query Param = works
    //form-data = not work
    @GetMapping
    public String testOne(String id,String name,String address,String salary){
        return "Test One Invoked Get Mapping"+id+" : "+name+" : "+address+" : "+salary;
    }

    //Query Param = works
    //form-data = works
    @PostMapping
    public String testTwo(String id,String name,String address,String salary){
        return "Test One Invoked Post Mapping"+id+" : "+name+" : "+address+" : "+salary;
    }

    //Query Param = works
    //form-data = not working
    @PutMapping
    public String testThree(String id,String name,String address,String salary){
        return "Test One Invoked Put Mapping"+id+" : "+name+" : "+address+" : "+salary;
    }


    //Query Param = works
    //form-data = not working
    @DeleteMapping
    public String testFour(String id,String name,String address,String salary){
        return "Test One Invoked Delete Mapping"+id+" : "+name+" : "+address+" : "+salary;
    }

}
