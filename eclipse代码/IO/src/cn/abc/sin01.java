package cn.abc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class  sin01{
	public static void main(String[] args) {
			FileInputStream fis=null;
			FileOutputStream fos =null;
			try {
				//File file=new File("D:/a.txt");
				//file.isDirectory();
				fos=new FileOutputStream("d:/b.txt");
				fis=new FileInputStream("D:\\a.txt");
				byte [] bytes=new byte[1024*1024];
				int readcount=0;
				while((readcount=fis.read(bytes))!=-1) {
					
					fos.write(bytes, 0, readcount);
				}
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
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}
	
}