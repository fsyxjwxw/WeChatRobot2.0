package com.ryan.robot.service.impl;

import com.ryan.robot.entity.vo.RemindVo;
import com.ryan.robot.mapper.RemindMapper;
import com.ryan.robot.service.EveryDayRemindService;
import com.ryan.robot.service.RemindService;
import com.ryan.robot.task.EveryDayTask;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 * @program: robot
 * @description:
 * @author: TBKJ
 * @create: 2021-09-21
 **/
@Service
public class EveryDayRemindServiceImpl implements EveryDayRemindService {

    @Resource
    private RemindMapper remindMapper;

    @Override
    public void executeEveryDayRemind() throws SchedulerException {
        //调度器
        SchedulerFactory sf = new StdSchedulerFactory();
        Scheduler sched = sf.getScheduler();

        //数据库结果集
        List<RemindVo> list = remindMapper.getEveryDayReminds();

        //遍历设定每日任务
        for (RemindVo remindVo : list) {
            JobDetail job = JobBuilder.newJob(EveryDayTask.class).withIdentity("everyDayJob", remindVo.getRemindId()).build();
            CronTrigger trigger = TriggerBuilder.newTrigger()
                    .withIdentity("everyDayTrigger", remindVo.getRemindId())
                    .usingJobData("name", remindVo.getName())
                    .usingJobData("toName", remindVo.getToName())
                    .usingJobData("content", remindVo.getContent())
                    .withSchedule(CronScheduleBuilder.cronSchedule(remindVo.getCron()))
                    .build();

            sched.scheduleJob(job, trigger);
            sched.start();

        }

    }
}
