package cn.intent;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ipText {
	 public static void main(String[] args) throws Exception {
		 //1
	        InetAddress addr = InetAddress.getLocalHost();
	        //����IP��ַ��192.168.1.110
	        System.out.println(addr.getHostAddress()); 
	        //������������gaoqi
	        System.out.println(addr.getHostName());     
	        
	        
	        //2
	        InetAddress addr2 = InetAddress.getByName("www.baidu.com");
	        // ���� sxt��������IP:59.110.14.7
	        System.out.println(addr2.getHostAddress());
	        // �����www.sxt.cn
	        System.out.println(addr2.getHostName());
	        
	        //3
	        InetAddress addr3= InetAddress.getByName("59.110.14.7");
	        // ����sxt��������IP��59.110.14.7
	        System.out.println(addr3.getHostAddress());
	        /*
	         * ���ip������������������IP��ַ�����ڻ�DNS���������������IP��ַ
	         * ��������ӳ�䣬getHostName������ֱ�ӷ������IP��ַ��
	         */
	        System.out.println(addr3.getHostName());
	    }

}
