package cn.java01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *����ʱ�������ַ���֮��Ļ���ת��
 *DateFormat�������SimpleDateFormatʵ�����ʹ�ã�
 * @author lenovo
 *
 */

public class texeDate {
	public static void main(String[] args)throws ParseException {
		
		//1:��ʱ������ա���ʽ�ַ���ָ���ĸ�ʽ�� ת����Ӧ���ַ�����
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");//Ctrl+shift+o......����
		String str=df.format(new Date(4000000));
		System.out.println(str);
		
		
		//2:���ַ������ա���ʽ�ַ���ָ���ĸ�ʽ��ת����Ӧ��ʱ�����
		DateFormat df2=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date=df2.parse("2001-10-26 20:20:20");
		System.out.println(date);
		
		//3:���������ĸ�ʽ�ַ�  ����D,�ǵ������������
		DateFormat df3=new SimpleDateFormat("D");
		String str2=df3.format(new Date());
		System.out.println(str2);
		
		
	}

}
