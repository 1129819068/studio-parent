package com.free.studio.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * <p>Title: UtilDate.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: com.free.studio</p>
 * @author yewp
 * @date 2017年6月8日上午9:45:46
 * @version 1.0
 */
public class UtilDate {
	
	/**
     * 对指定日期格式的字符进行解析，返回日期Date对象
     * @param date 日期字符串
     * @param pattern 日期字符串格式，为空则默认以yyyyMMdd格式解析
     * @return Date对象
     */
	public static Date parseDate(String date, String pattern){
		if (date == null || date.equals("")) {
            return null;
		}
		if (pattern == null || pattern.trim().length() == 0){
			return parseDate(date);
		}
		try{
			SimpleDateFormat formatter = new SimpleDateFormat(pattern);
			return formatter.parse(date);
		}catch(Exception e){
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	/**
	 * 解析格式为yyyyMMdd的日期字符串为日期Date对象
	 * @param date 格式为yyyyMMdd的日期字符串
	 * @return Date对象
	 */
	public static Date parseDate(String date) {
		if (date == null || date.equals("")) {
            return null;
		} 
        try {
        	SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
            return formatter.parse(date);
        } catch (ParseException e) {
            return null;
        }     
    }

    /**
     * 解析格式为yyyyMMddHHmmss的日期时间字符串为日期Date对象
     * @param date 格式为yyyyMMddHHmmss的日期时间字符串
     * @return Date对象
     */
	public static Date parseDatetime(String datetime) {
        if (datetime == null || datetime.equals("")) {
            return null;
        } 
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
            return formatter.parse(datetime);
        } catch (ParseException e) {
            return null;
        }     
    }
	
	/**
	 * 将日期对象格式化为指定的日期格式字符串
	 * @param date 日期对象，不能为空，否则返回null
	 * @param pattern 日期字符串格式，不能为空
	 * @return 日期格式化字符串
	 */
	public static String formatDate(Date date, String pattern) {
	    if (date == null || pattern == null) {
	        return null;
	    }
	    SimpleDateFormat formatter = new SimpleDateFormat(pattern);
	    return formatter.format(date);
	}
	
	/**
	 * 将日期格式化为yyyy-MM-dd格式的字符串
	 * @param date 日期Date对象
	 * @return yyyy-MM-dd格式的字符串
	 */
	public static String formatDate(Date date) {
	    return formatDate(date,"yyyy-MM-dd");
	}
	
	/**
	 * 将yyyy-MM-dd格式的日期字符串更改为yyyyMMdd格式的8位日期字符串
	 * @param strDate yyyy-MM-dd格式的日期字符串
	 * @return yyyyMMdd格式的8位日期字符串
	 */
	public static String formatDate2YMD(String strDate) {
	    if (strDate==null) {
	        return "";
	    } else {
	        return strDate.replace("-", "");
	    }
	}
	
	/**
     * 将yyyy-MM-dd HH:mi:ss格式的日期字符串更改为yyyyMMddHHmiss格式的14位日期字符串
     * @param strDate yyyy-MM-dd HH:mi:ss格式的日期字符串
     * @return yyyyMMddHHmiss格式的14位日期字符串
     */
    public static String formatDate2YMDHMS(String strDate) {
        if (strDate==null || strDate.isEmpty()) return "";
        strDate = strDate.replace("-", "");
        strDate = strDate.replace(" ", "");
        strDate = strDate.replace(":", "");
        return strDate;
    }

	/**
     * 将yyyyMMdd格式的8位日期字符串更改为yyyy-MM-dd格式的日期字符串
     * @param strDate yyyyMMdd格式的8位日期字符串
     * @return yyyy-MM-dd格式的日期字符串
     */
	public static String formatDateStr(String strDate) {
	    if (strDate == null || strDate.length() < 8) {
	        return "";
	    } else {
	        return strDate.substring(0,4)+"-"+strDate.substring(4,6)+"-"+strDate.substring(6,8);
	    }
	}
	
    /**
     * 将yyyyMMddHHmmss格式的14位日期时间字符串更改为yyyy-MM-dd HH:mm:ss格式的日期字符串
     * @param strDate yyyyMMddHHmmss格式的14位日期字符串
     * @return yyyy-MM-dd HH:mm:ss格式的日期字符串
     */
    public static String formatDatetimeStr(String strDatetime) {
        if (strDatetime == null) {
            return "";
        } else {
            return UtilDate.formatDatetime(UtilDate.parseDatetime(strDatetime));
        }
    }	
    
    /**
     * 将yyyyMMddHHmmss格式的14位日期时间字符串更改为pattern格式的日期字符串
     * @param strDate yyyyMMddHHmmss格式的14位日期字符串
     * @return pattern格式的日期字符串yyyy-MM-dd HH:mm
     */
    public static String formatDatetimeStr(String strDatetime,String pattern) {
        if (strDatetime == null) {
            return "";
        } else {
            return UtilDate.formatDate(UtilDate.parseDatetime(strDatetime),pattern);
        }
    }
    
    /**
     * 将日期格式化为yyyy-MM-dd HH:mm:ss格式的字符串
     * @param date 日期Date对象
     * @return yyyy-MM-dd HH:mm:ss格式的字符串
     */
    public static String formatDatetime(Date date) {
        return formatDate(date,"yyyy-MM-dd HH:mm:ss");
    }

    /**
	 * 获取当前毫秒级时间，17位字符串
	 * @return
	 */
	public static String getCurrentTimeMillis(){
		return formatDate(new Date(),"yyyyMMddHHmmssSSS");
	}
	
    /**
     * 获取当前日期，8位YYYYMMDD字符串
     * @return 当前日期字符串
     */
    public static String getCurrentDate(){
        return formatDate(new Date(),"yyyyMMdd");
    }
    /**
     * 获取当前日期时间，14位YYYYMMDDHHMMSS字符串
     * @return 当前日期字符串
     */
    public static String getCurrentDatetime(){
        return formatDate(new Date(),"yyyyMMddHHmmss");
    }
	
    /**
     * 返回包含一个日期的 Variant (Date)，这一日期还加上了一段时间间隔<br>
     * 例：<br>
     * 取当前时间的年份减1的日期<br>
     * UtilDate.dateAdd("y", -1, new Date());<br>
     * return "20130415"
     * 
     * @param interval
     *            "y"-年,"m"-月,"d"-日
     * @param number
     *            要加上的时间间隔的数目。其数值可以为正数（得到未来的日期），也可以为负数（得到过去的日期）。
     * @param date
     *            传入的日期
     * @param format
     *            日期格式化字符串
     * @return
     */
    public static String dateAdd(String interval, int number, Date date, String format) {
        // interval, number, date
        if (date == null) {
            return "";
        }
        SimpleDateFormat dateFormat = (format != null ? new SimpleDateFormat(format) : new SimpleDateFormat());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        if (interval.equals("y")) {
            calendar.add(Calendar.YEAR, number);
        } else if (interval.equals("m")) {
            calendar.add(Calendar.MONTH, number);
        } else if (interval.equals("d")) {
            calendar.add(Calendar.DATE, number);
        }
        return dateFormat.format(calendar.getTime());
    }

    /**
     * 返回包含一个日期的 Variant (Date)，这一日期还加上了一段时间间隔，默认日期格式为yyyyMMdd。<br>
     * 例：<br>
     * 取当前时间的年份减1的日期<br>
     * UtilDate.dateAdd("y", -1, new Date());<br>
     * return "20130415"
     * 
     * @param interval
     *            "y"-年,"m"-月,"d"-日
     * @param number
     *            要加上的时间间隔的数目。其数值可以为正数（得到未来的日期），也可以为负数（得到过去的日期）。
     * @param date
     *            传入的日期
     * @return
     */
    public static String dateAdd(String interval, int number, Date date) {
        return dateAdd(interval, number, date, "yyyyMMdd");
    }

}
