package com.github.illiaderhun.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showMainMenu() {
        return "main-menu";
    }

    @RequestMapping("/showForm")
    public String showInputForm() {
        return "input-form";
    }

    @RequestMapping("/showStudent")
    public String showStudent(HttpServletRequest request, Model model) {
        String name = request.getParameter("studName").toUpperCase();
        model.addAttribute("studNameUpp", name);
        return "studentPage";
    }

    @RequestMapping("/showStudentR")
    public String showStudentR(@RequestParam("studName") String studName, Model model) {
        String name = "Hi my friend " + studName.toUpperCase();
        model.addAttribute("studNameUpp", name);
        return "studentPage";
    }

}
