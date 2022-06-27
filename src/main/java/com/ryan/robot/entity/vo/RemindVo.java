package com.ryan.robot.entity.vo;

import com.ryan.robot.entity.Remind;
import lombok.Data;

/**
 * @program: robot
 * @description: 提醒VO
 * @author: TBKJ
 * @create: 2021-09-21
 **/
@Data
public class RemindVo extends Remind {
    private String xh;
    private String name;
}
