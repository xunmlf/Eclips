package cn.java02;
/**
 高考倒计时
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class gao {
	public static void main(String[] args) throws Exception{
		
		//获取当前时间
		Date date=new Date();
		System.out.print("当前时间：");
		System.out.println(date);
		
		
		
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date2=df.parse("2020-07-08 09:30:20");
		Date date3=df.parse("2020-07-17 09:30:00");
		System.out.print("中考时间：");
		System.out.println(date3);
		System.out.print("高考时间：");
		System.out.println(date2);
		
		//将日期转化为天数
		DateFormat df2=new SimpleDateFormat("D");
		String str1=df2.format(date);
		String str2=df2.format(date2);
		String str3=df2.format(date3);
		
		
		System.out.println(str1);
		
		System.out.println(str2);
		
		System.out.println(str3);
	
		//转型
		System.out.print("距离高考：");
		System.out.println(Integer.parseInt(str2)-Integer.parseInt(str1));
		System.out.print("距离中考：");
		System.out.println(Integer.parseInt(str3)-Integer.parseInt(str1));
		
		
	}

}
