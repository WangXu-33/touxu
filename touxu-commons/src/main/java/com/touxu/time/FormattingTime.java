package com.touxu.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author 王旭
 * @date 2022/4/30 20:07
 */
public class FormattingTime {
    /**
     * 返回一个LocalDateTime类型(yyyy-MM-dd HH:mm:ss)
     * @param s 字符串类型
     * @return     返回一个LocalDateTime类型(yyyy-MM-dd HH:mm:ss)
     */
    public static LocalDateTime getLocalDatetime(String s) {
        return LocalDateTime.parse(s, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }


    /**
     *
     * @return  返回一个字符串类型的当前日期
     */
    public static String getFormatTime() {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now());
    }




}
