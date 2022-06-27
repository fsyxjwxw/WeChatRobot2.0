package com.ryan.robot.service.impl;

import com.ryan.robot.mapper.LoginMapper;
import com.ryan.robot.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: robot
 * @description:
 * @author: TBKJ
 * @create: 2022-01-27
 **/
@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private LoginMapper loginMapper;

    @Override
    public String login(String username, String password) {
        return loginMapper.login(username, password);
    }
}
