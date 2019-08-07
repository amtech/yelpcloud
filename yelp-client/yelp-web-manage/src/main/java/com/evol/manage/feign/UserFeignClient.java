package com.evol.manage.feign;

import com.evol.manage.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "yelp-provider-usc")
public interface UserFeignClient {

    @GetMapping("/users/find/{id}")
    User findById(@PathVariable("id") Long id);
}
