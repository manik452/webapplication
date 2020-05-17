package com.primebank;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CrunchifyHelloWorld {

    @RequestMapping("/")
    public String greeting(Model model) {
        model.addAttribute("message","Hello THis is");
        return "welcome";
    }

    @RequestMapping("/welcome")
    public ModelAndView helloWorld() {

        String message = "<br><div style='text-align:center;'>"
                + "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
        return new ModelAndView("welcome", "message", message);
    }

   /* @RequestMapping(value = "/", method = RequestMethod.GET)
    public String greeting() {
        return "welcome";
    }*/
}