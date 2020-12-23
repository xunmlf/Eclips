package cn.abc;

import java.io.FileReader;
import java.io.FileWriter;

public class copy02 {
	public static void main(String[] args) {
		
		FileReader in=null;
		FileWriter out=null;
		try {
			
			//创建一个输入流对象；
			
			in=new FileReader("D:/a.txt");
			//创建一个输出流对象；
			out=new FileWriter("D:/r.txt");
			
			
			char[] chars=new char[9];
			int sss=0;
			while((sss=in.read(chars))!=-1) {
				out.write(chars, 0, sss);
			}
			out.flush();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if(in!=null) {
				try {
					in.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			if(out!=null) {
					try {
						out.close();
					} catch (Exception e2) {
						// TODO: handle exception
						e2.printStackTrace();
					}
				}
			}
		}
	}

}
