package cn.abc;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copy01 {
	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			
			//1：创建一个输入流对象
			fis=new FileInputStream("d:/a.txt");
			
			//2：创建一个输出流对象
			fos=new FileOutputStream("d:c.txt");
			
			//最核心部分，一边读一边写
			byte[] bytes=new byte[1024*1024];
			int readDate=0;
			while((readDate=fis.read(bytes))!=-1) {
				fos.write(bytes, 0, readDate);
			}
			
			//刷新，输出流最后要刷新
			fos.flush();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if(fis!=null) {
				try {
					fis.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
			if(fos!=null) {
				try {
					fos.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	}

}
