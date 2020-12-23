package cn.abc;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class logs2 {
	public static void log(String[] msg) {
		
		try {
			
			PrintStream ps=new PrintStream(new FileOutputStream("log.txt"));
			
			System.setOut(ps);
			
			Date nowTime=new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
			String str=sdf.format(nowTime);
			
			System.out.println(str+":"+msg);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
