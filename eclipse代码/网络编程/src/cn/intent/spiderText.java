package cn.intent;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 网络爬虫原理
 * @author lenovo
 *
 */
public class spiderText {
	public static void main(String[] args) throws Exception {
		//获取URL
		URL uu=new URL("http://www.baidu.com");
		

		//下载资源
		InputStream in=uu.openStream();//引流
		
		BufferedReader br=new BufferedReader(new InputStreamReader(in,"UTF-8"));
	
		String msg=null;
		while(null!=(msg=br.readLine())) {
			System.out.println(msg);
		}
		br.close();
		
		
	}

}
