package com.evol.provider.web.controller;

import com.evol.provider.model.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/users")
@RestController
public class UserController {

    @GetMapping("find/{id}")
    public User findById(HttpServletRequest httpReq, @PathVariable Long id){
        User user = new User();
        user.setId(id);
        user.setNick("zhagnsan" + id);
        user.setUsername("name_zhangshan" + id);
        String url = httpReq.getRequestURL().toString();
        String addr = httpReq.getRemoteAddr();
        System.out.println(String.format("request url : %s, addr : %s", url, addr));
        return user;
    }
}
