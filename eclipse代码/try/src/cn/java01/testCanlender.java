package cn.java01;


/**
 * �����������ʹ�ã�
 * @author lenovo
 *
 */

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class testCanlender {
	public static void main(String[] args) {
		
		//1��������ڵ����Ԫ��
		Calendar c=new GregorianCalendar(2999,10,9,22,10,50);
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH);
		int day=c.get(Calendar.DATE);
		int weekday=c.get(Calendar.DAY_OF_WEEK);//��ʾ���ڼ�
		System.out.println(year);
		System.out.println(month);//0-11��ʾ��Ӧ���·ݣ�0��һ�£��Դ����ƣ�
		System.out.println(weekday);
		System.out.println(day);
		System.out.println("*************************");
		
		//2���������ڵ����Ԫ��
		Calendar c2=new GregorianCalendar();
		c2.set(Calendar.YEAR,2055);
		System.out.println(c2);
		
		//3:���ڵļ���
		Calendar c3=new GregorianCalendar();
		c3.add(Calendar.DATE, 100);//����100��     ��ǰ��-100��
		System.out.println(c3);
		
		//4�����ڶ����ʱ������ת��
		Date d4=c3.getTime();
		Calendar c4=new GregorianCalendar();
		c4.setTime(new Date());
		printCalender(c4);
		
	}

	public static void printCalender(Calendar c) {
		
		//��ӡʱ��
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH)+1;
		int date=c.get(Calendar.DAY_OF_MONTH);
		int weekday=c.get(Calendar.DAY_OF_WEEK);
		String weekday2=weekday==0?"��":weekday+"";
		System.out.println(year+"��"+month+"��"+date+"��");
	}
}
