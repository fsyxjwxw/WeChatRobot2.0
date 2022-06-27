package com.ryan.robot;

import com.ryan.robot.service.EveryDayRemindService;
import com.ryan.robot.service.RemindService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
class RobotApplicationTests {

    @Resource
    RemindService remindService;

    @Resource
    private EveryDayRemindService everyDayRemindService;

    @Test
    void contextLoads() throws SchedulerException {
//        remindService.getEveryDayReminds();
//        everyDayRemindService.executeEveryDayRemind();
    }

}
