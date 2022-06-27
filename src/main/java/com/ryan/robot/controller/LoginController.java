package com.ryan.robot.controller;

import com.ryan.robot.entity.vo.Result;
import com.ryan.robot.service.LoginService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @program: robot
 * @description: 登录接口
 * @author: TBKJ
 * @create: 2022-01-27
 **/
@RestController
@CrossOrigin
public class LoginController {

    @Resource
    private LoginService loginService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Result login(String username,String password){
        String userId = loginService.login(username, password);
        if (Objects.nonNull(userId)){
            return Result.success(userId,"登录成功");
        }else {
            return Result.err("账号或密码错误");
        }
    }

}
