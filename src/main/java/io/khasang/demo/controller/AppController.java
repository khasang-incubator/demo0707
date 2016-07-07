package io.khasang.demo.controller;

import io.khasang.demo.model.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
    @Autowired
    Hello hello;

    @RequestMapping("/")
    public String hello(Model model){
        model.addAttribute("hello", "Hello World, My first spring Application!");
        model.addAttribute("bean", hello.getMessageInfo());
        return "index";
    }
}
