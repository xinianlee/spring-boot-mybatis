package com.xinian;


import java.util.Calendar;
import java.util.Date;

/**
 * @author xinian
 * @date 2018/12/3 22:48
 */
public class DateTest {

	public static void main(String[] args) {
		DateTest dt = new DateTest();
		Date days = dt.getDays(1);
		System.out.println(days);
	}

	public Date getDays(int days){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.DATE,days);
		return calendar.getTime();
	}
}
