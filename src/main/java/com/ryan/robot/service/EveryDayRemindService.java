package com.ryan.robot.service;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;

public interface EveryDayRemindService {

    public void executeEveryDayRemind() throws SchedulerException;
}
