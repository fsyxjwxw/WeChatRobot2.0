package com.ryan.robot.task;

import com.ryan.robot.robot.WeChatRobot;
import com.ryan.robot.utils.DateUitls;
import lombok.Data;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @program: robot
 * @description: 每日任务
 * @author: TBKJ
 * @create: 2021-09-21
 **/
@Data
public class EveryDayTask implements Job {
    private String name;
    private String toName;
    private String content;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        WeChatRobot robot = new WeChatRobot();
        System.out.println("------------------消息发送------------------");
        System.out.println("发送时间:"+ DateUitls.getDate());
        System.out.println("发送人员:"+name);
        System.out.println("接收人员:"+toName);
        System.out.println("发送内容"+content);
        System.out.println("-------------------------------------------");
        robot.OpenWeChat();
        robot.ChooseFriends(toName);
        robot.SendMessage(content);
    }
}
