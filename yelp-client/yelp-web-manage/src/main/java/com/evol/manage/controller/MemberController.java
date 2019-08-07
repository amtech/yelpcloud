package com.evol.manage.controller;

import com.evol.manage.feign.UserFeignClient;
import com.evol.manage.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/member")
@RestController
public class MemberController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("users/{id}")
    public User findById(@PathVariable Long id){
        User user = restTemplate.getForObject("http://yelp-provider-usc/users/find/{id}", User.class, id);
        return user;
    }

    @GetMapping("users2/{id}")
    public User findById2(@PathVariable Long id){
        User user = userFeignClient.findById(id);
        return user;
    }


}
