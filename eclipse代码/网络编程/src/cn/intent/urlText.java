package cn.intent;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * URL:同意资源管理器，互联网三大基石之一（html http URL）区分资源
 * 1:协议
 * 2：域名/计算机名
 * 3：端口
 * 4请求资源
 * 
 * http://www.google.cn:80/webhp#aa?canhu=33
 * @author lenovo
 *
 */
public class urlText {
	public static void main(String[] args) throws MalformedURLException {
		URL u=new URL("http://www.google.cn:80/webhp#aa?canhu=33");
		
		//四个值
		System.out.println("协议:"+u.getProtocol());
		System.out.println("域名:"+u.getHost());
		System.out.println("端口:"+u.getPort());
		System.out.println("请求资源1:"+u.getFile());
		System.out.println("请求资源2："+u.getPath());
		
		//参数
		System.out.println("参数部分：" + u.getQuery());
		
		//锚点
        System.out.println("锚点：" + u.getRef());
	
        //
        URL u1 = new URL("http://www.abc.com/aa/");
        URL u2 = new URL(u, "2.html"); // 相对路径构建url对象
        System.out.println(u2.toString()); // http://www.abc.com/aa/2.html
}

}
