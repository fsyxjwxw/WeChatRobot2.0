package com.ryan.robot.task;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

public class TriggerTask{
    public static void main(String[] args) throws SchedulerException {
        JobDetail job = JobBuilder.newJob(EveryDayTask.class).withIdentity("job").build();

        CronTrigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("trigger1", "group1")
                .withSchedule(CronScheduleBuilder.cronSchedule("0/2 * * * * ?"))
                .build();

        SchedulerFactory sf = new StdSchedulerFactory();
        Scheduler sched = sf.getScheduler();
        sched.start();
        sched.scheduleJob(job,trigger);
    }
}
