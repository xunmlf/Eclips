package cn.abc;

import java.io.BufferedReader;
import java.io.FileReader;

public class testBufferedReader {
	public static void main(String[] args)throws Exception {
		
		
		//当一个流的构造方法中需要一个流的时候，这个被传进来的流叫做：节点流
		
		//外部负责包装的这个流叫做：包装流/处理流；
		
		//当前来说，FileReader就是一个节点流，BufferedReader就是一个包装流
		
		FileReader reader=new FileReader("D:/a.txt");
		
		BufferedReader br=new BufferedReader(reader);
		/*还可以写成：
		 * FlieInputStream in=new FlieInputStream("D:/a.txt");
		 *
		 *通过转换流转换
		 * InputStreamReader reader=new InputStreamReader(in);
		 * 
		 * BufferedReader br=new BufferedReader(reader);
		 * */
		String s=null;
		while((s=br.readLine())!=null) {
			System.out.println(s);
		}
		
		//节点流自动关闭，只需关闭最外层的流
		br.close();
		
	}

}
