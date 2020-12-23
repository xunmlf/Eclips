package cn.intent;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 爬虫效应+模拟浏览器
 * @author lenovo
 *
 */
public class spiderText02 {
	public static void main(String[] args) throws Exception {
	           	//获取URL
				//URL uu=new URL("http://www.baidu.com");
				URL uu=new URL("https://www.dianping.com");

				//下载资源
				//InputStream in=uu.openStream();//引流
				HttpURLConnection conn=(HttpURLConnection)uu.openConnection();
				conn.setRequestMethod("GET");
				conn.setRequestProperty("User-Agent"," Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.106 Safari/537.36");
				BufferedReader br=new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
			
				String msg=null;
				while(null!=(msg=br.readLine())) {
					System.out.println(msg);
				}
				br.close();
	}

}
