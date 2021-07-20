package com.service;

import com.dao.UserLoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService {

    @Autowired
    private UserLoginDao userLoginDao;

    public boolean checkLogin(int id) {
        System.out.println("In Service class...Check Login");
        return true;
    }
}