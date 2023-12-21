package pl.edu.vistula.Javaspringinitialproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
public class HelloController {

    @GetMapping(value = "/")
    public String hello(){ return "greeting";}

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required =false, defaultValue ="World") String name, Model model) {
        model.addAttribute("name",name);
        return "greeting";
    }
    //http://localhost:8080/greeting?name=Vistula
}