package com.prabhleen;

import com.entities.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletContext;
import java.util.Date;
import java.util.List;

@Controller
public class HomeCtrl {
    @Autowired
    ServletContext context;
    @RequestMapping("/home")
    public String home(Model m) {
        String str="home";
        m.addAttribute("page",str);
        List<Todo> list= (List<Todo>) context.getAttribute("list");
        m.addAttribute("todos",list);
        return "home";
    }
    @RequestMapping("/add")
    public String addTodo(Model m) {
        Todo t = new Todo();
        m.addAttribute("page","add");
        m.addAttribute("todo",t);
        return "home";
    }
    @RequestMapping(value="/saveTodo",method=RequestMethod.POST)
    public String saveTodo(@ModelAttribute("todo") Todo t , Model m) {
        System.out.println(t);
        t.setTodoDate(new Date());
        List <Todo> list=(List <Todo>) context.getAttribute("list");
        list.add(t);
        m.addAttribute("msg","successfully added ");
        return "home";
    }
}
