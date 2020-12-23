package cn.abc;

import java.io.FileWriter;

public class testFlieWriter {
	public static void main(String[] args) {
		FileWriter out=null;
		try {
			out=new FileWriter("D:/d.txt");
			
			char[] chars= {'我','是','中','国','人'};
			
			out.write(chars);
			out.flush();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if(out!=null) {
				try {
					out.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
		
	}

}
