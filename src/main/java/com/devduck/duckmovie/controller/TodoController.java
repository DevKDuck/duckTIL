package com.devduck.duckmovie.controller;

import com.devduck.duckmovie.dto.TodoDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/todo")
@Log4j2
public class TodoController {
    @RequestMapping("/list")
    public void list(Model model) {
        log.info("todo list.....");
    }

    @GetMapping("/register")
    public void registerGET(){
        log.info("GET todo register...");
    }

    @PostMapping("/register")
    public String registerPOST(TodoDTO todoDTO, RedirectAttributes redirectAttributes){
        log.info("POST todo register...");
        log.info("todoDTO: " + todoDTO);
        return "redirect:/todo/list";
    }

}
