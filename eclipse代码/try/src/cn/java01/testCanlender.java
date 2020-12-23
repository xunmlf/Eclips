package cn.java01;


/**
 * 测试日期类的使用；
 * @author lenovo
 *
 */

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class testCanlender {
	public static void main(String[] args) {
		
		//1：获得日期的相关元素
		Calendar c=new GregorianCalendar(2999,10,9,22,10,50);
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH);
		int day=c.get(Calendar.DATE);
		int weekday=c.get(Calendar.DAY_OF_WEEK);//表示星期几
		System.out.println(year);
		System.out.println(month);//0-11表示对应的月份，0是一月，以此类推；
		System.out.println(weekday);
		System.out.println(day);
		System.out.println("*************************");
		
		//2：设置日期的相关元素
		Calendar c2=new GregorianCalendar();
		c2.set(Calendar.YEAR,2055);
		System.out.println(c2);
		
		//3:日期的计算
		Calendar c3=new GregorianCalendar();
		c3.add(Calendar.DATE, 100);//往后100天     往前是-100；
		System.out.println(c3);
		
		//4：日期对象和时间对象的转化
		Date d4=c3.getTime();
		Calendar c4=new GregorianCalendar();
		c4.setTime(new Date());
		printCalender(c4);
		
	}

	public static void printCalender(Calendar c) {
		
		//打印时间
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH)+1;
		int date=c.get(Calendar.DAY_OF_MONTH);
		int weekday=c.get(Calendar.DAY_OF_WEEK);
		String weekday2=weekday==0?"日":weekday+"";
		System.out.println(year+"年"+month+"月"+date+"日");
	}
}
