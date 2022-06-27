package com.ryan.robot;

import com.ryan.robot.task.TimeTask;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @program: robot
 * @description: 启动类实现
 * @author: TBKJ
 * @create: 2021-09-21
 **/
@Component
public class ApplicationRunnerImpl implements ApplicationRunner {

    @Resource
    TimeTask timeTask;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        timeTask.scanTimeTask();
    }
}
