package com.devduck.duckmovie.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;

@Controller
@Log4j2
public class SampleController {
    @GetMapping("/hello")
    public void hello(){
        log.info("hello...");
    }

    @GetMapping("/ex1")
    public void ex1(String name,int age){
        log.info("ex1...");
        log.info("name: " + name);
        log.info("age: " + age);
    }

    @GetMapping("/ex2")
    public void ex2(@RequestParam(name="name", defaultValue = "devkduck") String name
                    , @RequestParam(name="age", defaultValue = "30") int age){
        log.info("ex2...");
        log.info("name: " + name);
        log.info("age: " + age);
    }

    @GetMapping("/ex3")
    public void ex3(LocalDate localDate){
        log.info("ex3...");
        log.info("localDate: " + localDate);
    }

    @GetMapping("/ex4")
    public void ex4(Model model){
        log.info("---------------------");
        model.addAttribute("message", "Hello World");
    }

    @GetMapping("/ex5")
    public String ex5(RedirectAttributes redirectAttributes){
        redirectAttributes.addAttribute("name", "ABC"); //쿼리스트링으로 보냄
        redirectAttributes.addFlashAttribute("result", "success"); //일회용 사용 새로고침시 없어짐
        return "redirect:/ex6";
    }
    @GetMapping("/ex6")
    public void ex6(){

    }

    @GetMapping("/ex7")
    public void ex7(String p1, int p2){
        log.info("p1......"+p1);
        log.info("p2......"+p2);
    }
}
