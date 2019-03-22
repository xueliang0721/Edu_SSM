package com.yuxiu.edu.service;

import com.yuxiu.edu.model.User;
import com.yuxiu.edu.service.base.IBaseService;

public interface IUserService extends IBaseService<User>{

    //特有的方法
    public User login(String username, String password);
}
