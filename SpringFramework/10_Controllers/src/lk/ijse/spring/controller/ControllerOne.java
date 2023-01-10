package lk.ijse.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/customer")
public class ControllerOne {

    public ControllerOne(){
        System.out.println("Controller Instantiated");
    }

    @GetMapping
    public ModelAndView invokeMe(){
        return new ModelAndView("/customer");
    }


}
