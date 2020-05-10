package com.fwtai.controller;

import com.fwtai.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单中心
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-05-09 14:18
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
*/
@RestController
@RequestMapping("role")//必须以 spring.application.name 的值定义,如果每个微服务只处理一个模块的话，可以用name的值!!!
public class RoleController{

    @Autowired
    private RoleService roleService;

    // http://127.0.0.1:8081/role/102420483076
    @GetMapping(value = "/{name}")
    public String order(@PathVariable String name){
        return roleService.order(name);
    }
}