package com.example.mvcdemo.controller;

import com.example.mvcdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MVCDemoController {

    @GetMapping("/mvcdemo")
    public ModelAndView hello(){
        User user = new User();
        user.setName("zhonghua");
        user.setAge(18);

        ModelAndView modelAndView = new ModelAndView("mvcdemo");
        modelAndView.addObject(user);
        return modelAndView;
    }
}
