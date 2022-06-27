package com.ryan.robot.controller;

import com.ryan.robot.entity.vo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: robot
 * @description:
 * @author: TBKJ
 * @create: 2022-01-09
 **/
@RestController
public class CommitTaskController {

    @RequestMapping(value = "/commitTask",method = RequestMethod.POST)
    public Result commitTask(){
        return null;
    }

}
