package com.fwtai.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 订单业务处理中心
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-05-09 14:24
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
*/
@Service
public class RoleService{

    public String order(final String name){
        return "Hello! 我是Order服务,专门处理订单,感谢你(" + name + ")来调用我的order方法";
    }
}