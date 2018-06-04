package com.gupao.web.controller;


import com.gupao.domain.User;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {


    //@PostMapping("/user/save")
    @RequestMapping("/user/save")
    public User save(@Valid @RequestBody User user){
        //  @Valid 表示的是校验传入参数 user 中的字段必须按照传入参数指定的规则进行传值
        System.out.println("run save method");
        return user;
    }




    @PostMapping("/user/save2")
    public User save2( @RequestBody User user){
        //  @Valid 表示的是校验传入参数 user 中的字段必须按照传入参数指定的规则进行传值

        Assert.hasText("name can not be null",user.getName());

        assert user.getId() <= 10000;

        return user;

    }






}
