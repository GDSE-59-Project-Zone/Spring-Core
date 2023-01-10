package lk.ijse.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/item")
public class ControllerTwo {

    @GetMapping
    public ModelAndView loadItemView(){
        return new ModelAndView("/item");
    }
}
