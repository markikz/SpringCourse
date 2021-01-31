package org.mark.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.View;

@Controller
@RequestMapping("/calculator")
public class CalculatorController {


    @GetMapping("/calculate")
    public String Calculate(@RequestParam("a") Integer a,
                            @RequestParam("b") Integer b,
                            @RequestParam("action") String action,
                            Model model) {

        double ans = -0;
        if(action.equals("multiplication")){
            ans = a*b;
        } else if(action.equals("summ")){
            ans = a+b;
        }

        model.addAttribute("calculation", a + action + b + "=" + ans);

        return "calculator/index";
    }

}
