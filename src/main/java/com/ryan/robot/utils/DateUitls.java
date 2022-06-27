package com.ryan.robot.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: robot
 * @description: 日期工具类
 * @author: TBKJ
 * @create: 2022-01-09
 **/
public class DateUitls {
    public static String getDate(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
        return sdf.format(date);
    }
}
