package com.ryan.robot.controller;

import com.ryan.robot.entity.vo.Result;
import com.ryan.robot.service.RemindService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: robot
 * @description:
 * @author: TBKJ
 * @create: 2022-01-27
 **/
@RestController
@CrossOrigin
public class RemindController {
    @Resource
    private RemindService remindService;

    @RequestMapping("/getRemindByUserId")
    public Result getRemindByUserId(String userId){
        try{
            return Result.success(remindService.getRemindByUserId(userId),"查询成功");
        }catch (Exception e){
            e.printStackTrace();
            return Result.err("查询失败");
        }
    }
}
