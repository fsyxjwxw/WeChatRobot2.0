package com.ryan.robot.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginMapper {

    @Select("select user_id from r_user where username = #{username} and password = #{password}")
    public String login(@Param("username") String username, @Param("password") String password);

}
