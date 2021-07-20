package com.controller;
import com.dao.TodoDao;
import com.dao.UserDao;
import com.dao.UserLoginDao;
import com.model.Todo;
import com.model.User;
import com.service.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import javax.servlet.ServletContext;
import java.util.Date;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    ServletContext context;

    @Autowired
    TodoDao todoDao;
    @Autowired
    private UserLoginDao doa;

    @Autowired
    UserDao userDao;
    @RequestMapping("/home/{id}")
    public String home(@PathVariable("id") int id, Model m ) {
        String str="home";
        m.addAttribute("page",str);
        List<String> list= doa.checkLogin(id);
        System.out.println(id);
        m.addAttribute("id",id);
        m.addAttribute("todos",list);
        return "home";
    }
    @RequestMapping("/add/{id}")
    public String addTodo(@PathVariable("id") int id,Model m) {
        Todo t = new Todo();
        m.addAttribute("page","add");
        m.addAttribute("todo",t);
        m.addAttribute("id",id);
        return "home";
    }
    @RequestMapping(value="/saveTodo/{id}",method=RequestMethod.POST)
    public String saveTodo(@PathVariable("id") int id, @ModelAttribute("todo") Todo t ,  Model m) {
        m.addAttribute("page","home");
        //System.out.println(u);
        t.setTodoDate(new Date());
        t.setUser(doa.getById(id));
        this.todoDao.save(t);
        m.addAttribute("id",id);
        m.addAttribute("msg","successfully added ");
        return "home";
    }
}
