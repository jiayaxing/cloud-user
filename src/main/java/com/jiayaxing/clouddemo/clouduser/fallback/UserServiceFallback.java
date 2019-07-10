package com.jiayaxing.clouddemo.clouduser.fallback;

import com.jiayaxing.clouddemo.clouduser.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class UserServiceFallback  implements UserService{

    @Override
    public String getName(String aa) {
        return "异常";
    }

    @Override
    @GetMapping(value = "userServiceController/getName1")
    public String getName1(String aa) {
        return "异常";
    }
}
