package cn.intent;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * ��������ԭ��
 * @author lenovo
 *
 */
public class spiderText {
	public static void main(String[] args) throws Exception {
		//��ȡURL
		URL uu=new URL("http://www.baidu.com");
		

		//������Դ
		InputStream in=uu.openStream();//����
		
		BufferedReader br=new BufferedReader(new InputStreamReader(in,"UTF-8"));
	
		String msg=null;
		while(null!=(msg=br.readLine())) {
			System.out.println(msg);
		}
		br.close();
		
		
	}

}
