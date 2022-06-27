package com.ryan.robot.task;

import com.ryan.robot.service.EveryDayRemindService;
import com.sproutsocial.nsq.Publisher;
import com.sproutsocial.nsq.Subscriber;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @program: robot
 * @description: 定时任务
 * @author: TBKJ
 * @create: 2021-09-21
 **/
@Component
public class TimeTask {

    @Resource
    public  EveryDayRemindService everyDayRemindService;

    //项目启动时，检索数据库中全部录入定时任务并执行
    public  void scanTimeTask() throws SchedulerException {
        //执行全部每日任务
        everyDayRemindService.executeEveryDayRemind();
    }


}
