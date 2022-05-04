package com.touxu.time;

/**
 * @author WangXu
 * @date 2022/4/30 20:14
 */

import java.time.Duration;

/**
 * The main purpose of this class is to compare two times
 */
public class CompareToTime {

    /**
     * @param start StartTime
     * @param end   EndTime
     * @return Checks whether a timeout has occurred, and returns true if so
     */
    public static Boolean overtime(String start, String end) {
        Duration between = Duration.between(FormattingTime.getLocalDatetime(start), FormattingTime.getLocalDatetime(end));
        /*If it's less than 0, it's timed out*/
        return between.toMillis() <= 0;
    }

    /**
     * @param start StartTime
     * @param end   EndTime
     * @return Checks whether a timeout has occurred, and returns false if so
     */
    public static Boolean noOvertime(String start, String end) {
        Duration between = Duration.between(FormattingTime.getLocalDatetime(start), FormattingTime.getLocalDatetime(end));
        /*If it is greater than 0, there is no timeout*/
        return between.toMillis() >= 0;
    }


    public static String getBetweenTime(String start, String end) {
        /*得到多少秒*/
        long l = Duration.between(FormattingTime.getLocalDatetime(start), FormattingTime.getLocalDatetime(end)).toMillis() / 1000;
        String time = "";
        if (l < 0) {
            l = -l;
        }else if (l == 0){
            return "时间一致";
        }
        long second = l % 60;
        long minute = (l / 60) % 60;
        long hour = (l / 60 / 60) % 24;
        long day = l / 60 / 60 / 24;

        if (day != 0)
            time = day + "天";
        if (hour != 0)
            time = time + hour + "时";
        if (minute != 0)
            time = time + minute + "分钟";
        if (second != 0)
            time = time + second + "秒";
        return time;
    }

}
