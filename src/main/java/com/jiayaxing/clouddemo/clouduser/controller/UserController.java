package com.jiayaxing.clouddemo.clouduser.controller;

import com.jiayaxing.clouddemo.clouduser.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@Api(tags = "UserController",description = "用户访问接口")
@RequestMapping(value = "userController")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @ApiOperation(value = "用户管理方法", notes = "用户管理")
    @RequestMapping(value = "getName", method = RequestMethod.GET)
    public String getName() {

        return userService.getName("555");
    }

    @ResponseBody
    @RequestMapping(value = "getName1", method = RequestMethod.GET)
    public String getName1() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return userService.getName1("555");
    }
}
