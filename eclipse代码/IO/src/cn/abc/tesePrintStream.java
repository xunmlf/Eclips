package cn.abc;
import java.io.FileOutputStream;
/**
 *��׼�ֽ������
 */
import java.io.PrintStream;

public class tesePrintStream {
	public static void main(String[] args)throws Exception {
		
		//����д
		System.out.println("hello world!");
		
		//�ֿ�д
		PrintStream ps=System.out;
		ps.println("hello world!");
		
	/*
     	//֮ǰSystem��ʹ�ù��ķ���������
		 System.gc();
		 System.exit(0);
		 System.currentTimeMillis();
		 PrintStream ps2=System.out;
		 */
		
		
		PrintStream ps3=new PrintStream(new FileOutputStream("d:/aa.txt"));
		
		System.setOut(ps3);
		System.out.println("hello world!");
		
	}

}
