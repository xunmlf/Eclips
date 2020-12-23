package cn.abc;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copy01 {
	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			
			//1������һ������������
			fis=new FileInputStream("d:/a.txt");
			
			//2������һ�����������
			fos=new FileOutputStream("d:c.txt");
			
			//����Ĳ��֣�һ�߶�һ��д
			byte[] bytes=new byte[1024*1024];
			int readDate=0;
			while((readDate=fis.read(bytes))!=-1) {
				fos.write(bytes, 0, readDate);
			}
			
			//ˢ�£���������Ҫˢ��
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
