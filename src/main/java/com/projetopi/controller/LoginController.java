/*
package com.projetopi.controller;

import com.projetopi.entidades.User;
import com.projetopi.services.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @Autowired
    UserService service;

    @GetMapping("/login/save")
    public String showLogin(Model model) {
        System.err.println("Teste");
        return "login.html";
    }

@RequestMapping(value = "/login/save", method = RequestMethod.GET)
    public String showLoginSave(User user){
            System.err.println("Olá" + user);
//        model.addAttribute("user");
        return "";
    }


    @RequestMapping(value = "/formAction", method = RequestMethod.POST)
    public String controllerMethod(HttpServletRequest request){
        // this way you get value of the input you want
        String pathValue1 = request.getParameter("path1");
        String pathValue2 = request.getParameter("path2");
        System.err.println("Help" +pathValue1);
        return "successfulView";
    }


}
*/
