package cn.intent;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * URL:ͬ����Դ�������������������ʯ֮һ��html http URL��������Դ
 * 1:Э��
 * 2������/�������
 * 3���˿�
 * 4������Դ
 * 
 * http://www.google.cn:80/webhp#aa?canhu=33
 * @author lenovo
 *
 */
public class urlText {
	public static void main(String[] args) throws MalformedURLException {
		URL u=new URL("http://www.google.cn:80/webhp#aa?canhu=33");
		
		//�ĸ�ֵ
		System.out.println("Э��:"+u.getProtocol());
		System.out.println("����:"+u.getHost());
		System.out.println("�˿�:"+u.getPort());
		System.out.println("������Դ1:"+u.getFile());
		System.out.println("������Դ2��"+u.getPath());
		
		//����
		System.out.println("�������֣�" + u.getQuery());
		
		//ê��
        System.out.println("ê�㣺" + u.getRef());
	
        //
        URL u1 = new URL("http://www.abc.com/aa/");
        URL u2 = new URL(u, "2.html"); // ���·������url����
        System.out.println(u2.toString()); // http://www.abc.com/aa/2.html
}

}
