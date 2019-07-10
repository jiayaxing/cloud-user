package com.jiayaxing.clouddemo.clouduser.service;

import com.jiayaxing.clouddemo.clouduser.fallback.UserServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name ="cloud-user-service",fallback = UserServiceFallback.class)
public interface UserService {
    @GetMapping(value = "userServiceController/getName")
    public String getName(@RequestParam("aa") String aa);

    @GetMapping(value = "userServiceController/getName1")
    public String getName1(@RequestParam("aa") String aa);
}
