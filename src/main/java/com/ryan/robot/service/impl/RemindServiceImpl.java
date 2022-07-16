package com.ryan.robot.service.impl;

import com.ryan.robot.entity.Remind;
import com.ryan.robot.entity.vo.RemindVo;
import com.ryan.robot.mapper.RemindMapper;
import com.ryan.robot.service.RemindService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: robot
 * @description: 提醒实现类
 * @author: TBKJ
 * @create: 2021-09-21
 **/
@Service
public class RemindServiceImpl implements RemindService {
    @Resource
    private RemindMapper remindMapper;

    @Override
    public List<RemindVo> getRemindByUserId(String userId) {
        return remindMapper.getRemindByUserId(userId);
    }
}
