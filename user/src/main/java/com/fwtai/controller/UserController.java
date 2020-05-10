package com.fwtai.controller;

import com.fwtai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商品管理
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-05-09 14:42
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
*/
@RestController
@RequestMapping("user")
public class UserController{

    @Autowired
    private UserService userService;

    // http://127.0.0.1:8082/user/order
    @GetMapping("/order")
    public String order(){
        return userService.order();
    }
}