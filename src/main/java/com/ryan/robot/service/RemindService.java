package com.ryan.robot.service;

import com.ryan.robot.entity.Remind;
import com.ryan.robot.entity.vo.RemindVo;

import java.util.List;

public interface RemindService {

    public List<RemindVo> getRemindByUserId(String userId);
}
