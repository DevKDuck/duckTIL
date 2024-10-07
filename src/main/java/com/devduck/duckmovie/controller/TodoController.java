package com.devduck.duckmovie.controller;

import com.devduck.duckmovie.dto.TodoDTO;
import com.devduck.duckmovie.service.TodoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/todo")
@Log4j2
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("/list")
    public void list(Model model) {
        log.info("todo list.....");
        model.addAttribute("dtoList", todoService.findAll());
    }

    @GetMapping("/register")
    public void registerGET(){
        log.info("GET todo register...");
    }

    @PostMapping("/register")
    public String registerPOST(@Valid TodoDTO todoDTO,
                               BindingResult bindingResult,
                               RedirectAttributes redirectAttributes){
        log.info("POST todo register...");
        if(bindingResult.hasErrors()){
            log.info("has Errors....");
            redirectAttributes.addFlashAttribute("errors", bindingResult.getAllErrors());
            return "redirect:/todo/register";
        }

        log.info("todoDTO: " + todoDTO);
        todoService.register(todoDTO);
        return "redirect:/todo/list";
    }

    @GetMapping({"/read","/modify"})
    public void read(Long tno, Model model){
        TodoDTO todoDTO = todoService.getById(tno);
        log.info("여기입니다 여기 :" + todoDTO);
        model.addAttribute("dto", todoDTO);

    }

    @PostMapping("/remove")
    public String remove(Long tno,RedirectAttributes redirectAttributes){
        log.info("---------------remove---------------");
        log.info("tno: " + tno);
        todoService.remove(tno);
        return "redirect:/todo/list";
    }

    @PostMapping("/modify")
    public String modify(@Valid TodoDTO todoDTO, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            log.info("has Errors....");
            redirectAttributes.addFlashAttribute("errors", bindingResult.getAllErrors());
            return "redirect:/todo/modify";
        }
        log.info(todoDTO);
        todoService.modify(todoDTO);
        return "redirect:/todo/list";
    }
}
