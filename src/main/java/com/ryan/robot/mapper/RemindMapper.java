package com.ryan.robot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ryan.robot.entity.Remind;
import com.ryan.robot.entity.vo.RemindVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RemindMapper extends BaseMapper<Remind> {

    @Select("select r.remind_id ,r.user_id,r.content,r.time,r.cron,r.type,u.name,r.to_name from r_remind r,r_user u where r.user_id = u.user_id and type = 1 and status = 1 ORDER BY time")
    public List<RemindVo> getEveryDayReminds();

    @Select("select ROW_NUMBER() OVER(ORDER BY remind_id) as xh,to_name,content,cron,IF(type=1,'每日','单次') as type,IF(status=1,'生效中','已失效') as 'status' from r_remind where user_id = #{userId}")
    public List<RemindVo> getRemindByUserId(@Param("userId")String userId);
}
