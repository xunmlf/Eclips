package cn.java02;
/**
 �߿�����ʱ
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class gao {
	public static void main(String[] args) throws Exception{
		
		//��ȡ��ǰʱ��
		Date date=new Date();
		System.out.print("��ǰʱ�䣺");
		System.out.println(date);
		
		
		
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date2=df.parse("2020-07-08 09:30:20");
		Date date3=df.parse("2020-07-17 09:30:00");
		System.out.print("�п�ʱ�䣺");
		System.out.println(date3);
		System.out.print("�߿�ʱ�䣺");
		System.out.println(date2);
		
		//������ת��Ϊ����
		DateFormat df2=new SimpleDateFormat("D");
		String str1=df2.format(date);
		String str2=df2.format(date2);
		String str3=df2.format(date3);
		
		
		System.out.println(str1);
		
		System.out.println(str2);
		
		System.out.println(str3);
	
		//ת��
		System.out.print("����߿���");
		System.out.println(Integer.parseInt(str2)-Integer.parseInt(str1));
		System.out.print("�����п���");
		System.out.println(Integer.parseInt(str3)-Integer.parseInt(str1));
		
		
	}

}
