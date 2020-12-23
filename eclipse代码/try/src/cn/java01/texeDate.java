package cn.java01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *测试时间对象和字符串之间的互相转换
 *DateFormat抽象类和SimpleDateFormat实现类的使用；
 * @author lenovo
 *
 */

public class texeDate {
	public static void main(String[] args)throws ParseException {
		
		//1:把时间对象按照“格式字符串指定的格式” 转成相应的字符串；
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");//Ctrl+shift+o......导入
		String str=df.format(new Date(4000000));
		System.out.println(str);
		
		
		//2:把字符串按照“格式字符串指定的格式”转成相应的时间对像；
		DateFormat df2=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date=df2.parse("2001-10-26 20:20:20");
		System.out.println(date);
		
		//3:测试其他的格式字符  比如D,是当年的所在天数
		DateFormat df3=new SimpleDateFormat("D");
		String str2=df3.format(new Date());
		System.out.println(str2);
		
		
	}

}
