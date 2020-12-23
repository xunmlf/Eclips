package cn.abc;
import java.io.FileOutputStream;
/**
 *标准字节输出流
 */
import java.io.PrintStream;

public class tesePrintStream {
	public static void main(String[] args)throws Exception {
		
		//联合写
		System.out.println("hello world!");
		
		//分开写
		PrintStream ps=System.out;
		ps.println("hello world!");
		
	/*
     	//之前System类使用过的方法和属性
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
