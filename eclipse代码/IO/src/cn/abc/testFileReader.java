package cn.abc;

import java.io.FileReader;

public class testFileReader {
	public static void main(String[] args) {
		
		
		FileReader reader=null;
		
		try {
			//创建文件字符输入流
			reader=new FileReader("D:/a.txt");
			
			char[] chars=new char[4];
			
			//读取
			reader.read(chars);
			for(char m:chars) {
				System.out.println(m);
			}
			/*int charDate=0;
			while((charDate=reader.read(chars))!=-1) {
				System.out.println(new String(chars,0,charDate));
			}*/
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if(reader!=null) {
				try {
					reader.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
				
			}
		}
	}

}
