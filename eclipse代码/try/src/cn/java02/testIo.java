package cn.java02;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class testIo {
	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			//����һ������������
			fis=new FileInputStream("d://aa.txt");
			
			//����һ�����������
			fos=new FileOutputStream("d://bb.txt");
			
			//
			byte[] bytes=new byte[1024];
			int g=0;
			while((g=fis.read(bytes))!=-1) {
				fos.write(bytes, 0, g);
			}
			
			//ˢ��
			fos.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
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
