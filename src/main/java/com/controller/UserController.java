package com.controller;
import com.model.User;
import com.model.UserLogin;
import com.service.UserLoginService;
import com.service.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    private UserRegisterService userRegisterService;

    @Autowired
    private UserLoginService userLoginService;

    @RequestMapping("/register")
    public String showForm(){
        return "register";
    }

    @RequestMapping(path="/processform",method= RequestMethod.POST)
    public String handleform(@ModelAttribute("user") User user , Model m){
                System.out.println(user);
                int createdUser= this.userRegisterService.createUser(user);
                m.addAttribute("msg","Your id  is "+ createdUser);
                return "success";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping(path="/loginsuccess",method= RequestMethod.POST)
    public String loginsuccess(@ModelAttribute("userLogin") UserLogin userLogin , Model m) {
        System.out.println(userLogin);
        m.addAttribute("userLogin",userLogin);
        boolean userExists = userLoginService.checkLogin(userLogin.getId());
            return "loginsuccess";
        }
}




