package cn.abc;

import java.io.BufferedReader;
import java.io.FileReader;

public class testBufferedReader {
	public static void main(String[] args)throws Exception {
		
		
		//��һ�����Ĺ��췽������Ҫһ������ʱ������������������������ڵ���
		
		//�ⲿ�����װ���������������װ��/��������
		
		//��ǰ��˵��FileReader����һ���ڵ�����BufferedReader����һ����װ��
		
		FileReader reader=new FileReader("D:/a.txt");
		
		BufferedReader br=new BufferedReader(reader);
		/*������д�ɣ�
		 * FlieInputStream in=new FlieInputStream("D:/a.txt");
		 *
		 *ͨ��ת����ת��
		 * InputStreamReader reader=new InputStreamReader(in);
		 * 
		 * BufferedReader br=new BufferedReader(reader);
		 * */
		String s=null;
		while((s=br.readLine())!=null) {
			System.out.println(s);
		}
		
		//�ڵ����Զ��رգ�ֻ��ر���������
		br.close();
		
	}

}
