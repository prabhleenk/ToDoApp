package com.dao;
import com.model.Todo;
import com.model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@Repository
public class UserLoginDao {
    public List<String> checkLogin(int id){
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory= cfg.buildSessionFactory();
        Session s=factory.openSession();
        Query q=s.createQuery("Select t.todoTitle from Todo as t INNER JOIN User as u on t.user= u and u.id=:x");
        q.setParameter("x",id);
        List<String> list = q.list();
        s.close();
        factory.close();
        return list;
    }

    public User getById(int uid){
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory= cfg.buildSessionFactory();
        Session s=factory.openSession();
        boolean userFound = false;
        Query q=s.createQuery("from User where id=:x");
        q.setParameter("x",uid);
        List<User> list = q.list();
        return list.get(0);
    }

}

