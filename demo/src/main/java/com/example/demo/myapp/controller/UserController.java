package com.example.demo.myapp.controller;
import com.example.demo.myapp.model.UserDo;
import com.example.demo.utils.Result;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/v1/user")
public class UserController {
    @RequestMapping(value="/list",method = RequestMethod.GET)
    public UserDo get() {
        UserDo user = new UserDo();
        user.setAge(20);
        user.setName("zeyang");
        return user;
    }
    @RequestMapping(value="/list2",method=RequestMethod.GET)
    public Result gets() {
        UserDo user = new UserDo();
        user.setAge(20);
        user.setName("zeyang");

        return Result.build(200,"success",user);

    }
}
