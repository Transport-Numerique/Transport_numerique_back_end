package com.example.backend_transport.controlleur;

import org.springframework.ui.Model;
import com.example.backend_transport.model.Login;
import com.example.backend_transport.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@CrossOrigin
public class LoginController {
    @Autowired
    private LoginService loginService;

    @GetMapping("/home")
    public String homelogin(@ModelAttribute Login login, Model model){
        System.out.println(login.toString());
        return "home";
    }
    @PostMapping("/saveLogin")
    public String saveLogin(@ModelAttribute("login") Login login,Model model){
        if (loginService.emailExists(login.getEmail())){
            model.addAttribute("email deja enrgistrer");
            model.addAttribute("showAlert", true);
            return "home";
        }else {
            loginService.registerLogin(login);
            return "redirect:/loginList";
        }

    }

    @GetMapping("/loginList")
    public String listLogin(Model model){
        List<Login> loginList=loginService.loginList();
        model.addAttribute("loginList" ,loginList);
                return "listLogin";
    }
    @GetMapping("/pageAcceuil")
    public String pageAcceuil(@ModelAttribute Login login, Model model){
        System.out.println("page d'acceuil en cours");
        return "pageServcie";
    }



}
