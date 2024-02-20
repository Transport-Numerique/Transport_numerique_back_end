package com.example.backend_transport.controlleur;

import com.example.backend_transport.model.Users;
import com.example.backend_transport.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@CrossOrigin
public class UserControlleur {
    @Autowired
    private UserService userService;
    @GetMapping("/register")
    public String register(@ModelAttribute Users users, Model model){
        System.out.println("page de register en cours d'execution");
      return "register";
     }
    @GetMapping("/acceuil")
    public String acceuil(@ModelAttribute Users users, Model model){
        System.out.println("page acceuil en cours");
        return "acceuil";
    }
    @GetMapping("/loginform")
    public String login(){
        System.out.println("page login");
        return "home";
    }

    //regarder list de user
    @GetMapping("/listUsers")
    public String allListUsers(Model model){
        List<Users> listUsers = userService.listUsers();
        model.addAttribute("listUsers", listUsers);
        return "listUsers";
    }

    //enregister un user dans la dase de donnée
    @PostMapping("/registerUser")
    public String regiserUser(@ModelAttribute("users") Users users,Model model){
        if(userService.emailExist(users.getEmail())){
            model.addAttribute("email existe deja");
            model.addAttribute("erreur",true);
            return "register";
        }
        else {
            userService.registreUser(users);
            return "redirect:/home";
        }
   }

}
