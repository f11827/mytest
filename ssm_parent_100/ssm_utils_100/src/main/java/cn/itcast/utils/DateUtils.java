package cn.itcast.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	public static String  formatDateToStr(Date date) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
		
		
	}
}
