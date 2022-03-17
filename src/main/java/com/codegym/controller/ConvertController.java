package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConvertController {
    @GetMapping("/convert")
    public ModelAndView showConvert () {
        ModelAndView modelAndView = new ModelAndView("convert");
        return modelAndView;
    }

    @PostMapping ("/convert")
    public ModelAndView doConvert (@RequestParam double usd){
        double vnd = usd * 23000;
        ModelAndView modelAndView = new ModelAndView("convert");
        modelAndView.addObject("usd", usd);
        modelAndView.addObject("vnd", vnd);
        return modelAndView;
    }

}
