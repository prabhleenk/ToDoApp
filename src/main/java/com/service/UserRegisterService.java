package com.service;
import com.dao.UserDao;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegisterService {
    @Autowired
    private UserDao userDao;
    public int createUser(User user){
        return this.userDao.saveUser(user);
    }
}
