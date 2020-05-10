package com.fwtai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 商品管理
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-05-09 14:44
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
*/
@Service
public class UserService{

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${spring.application.name}")
    private String appName;

    public String order(){
        final ServiceInstance serviceInstance = loadBalancerClient.choose("role"); // 负载均衡获取我们实际要访问的项目地址
        final String url = String.format("http://%s:%s/role/%s",serviceInstance.getServiceId(),serviceInstance.getPort(),appName);//注意那个 role 是控制层controller的映射名
        return restTemplate.getForObject(url,String.class);
    }
}