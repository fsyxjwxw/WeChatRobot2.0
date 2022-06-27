package com.ryan.robot.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * @program: robot
 * @description: 提醒实体
 * @author: TBKJ
 * @create: 2021-09-21
 **/
@Data
public class Remind {
    @TableId
    private String remindId;
    private String userId;
    private String content;
    private Date time;
    private String cron;
    private String type;
    private String note;
    private String status;
    private String toName;
}
