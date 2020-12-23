package cn.intent;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ipText {
	 public static void main(String[] args) throws Exception {
		 //1
	        InetAddress addr = InetAddress.getLocalHost();
	        //返回IP地址：192.168.1.110
	        System.out.println(addr.getHostAddress()); 
	        //输出计算机名：gaoqi
	        System.out.println(addr.getHostName());     
	        
	        
	        //2
	        InetAddress addr2 = InetAddress.getByName("www.baidu.com");
	        // 返回 sxt服务器的IP:59.110.14.7
	        System.out.println(addr2.getHostAddress());
	        // 输出：www.sxt.cn
	        System.out.println(addr2.getHostName());
	        
	        //3
	        InetAddress addr3= InetAddress.getByName("59.110.14.7");
	        // 返回sxt服务器的IP：59.110.14.7
	        System.out.println(addr3.getHostAddress());
	        /*
	         * 输出ip而不是域名。如果这个IP地址不存在或DNS服务器不允许进行IP地址
	         * 和域名的映射，getHostName方法就直接返回这个IP地址。
	         */
	        System.out.println(addr3.getHostName());
	    }

}
