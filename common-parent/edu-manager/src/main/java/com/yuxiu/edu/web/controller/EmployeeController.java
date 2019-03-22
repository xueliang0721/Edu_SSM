package com.yuxiu.edu.web.controller;

import com.yuxiu.edu.model.User;
import com.yuxiu.edu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("employee")
public class EmployeeController {


    @RequestMapping("manage")
    public String manage(){
        return "employee/manage";
    }

    @RequestMapping("info")
    public String info(){
        return "employee/info";
    }

    @RequestMapping("edit")
    public String edit(){
        return "employee/edit";
    }
}
