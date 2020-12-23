package cn.abc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class dome {
		public static void main(String[] args) {
			try {
			File f=new File("D:/yi.txt");
			FileWriter fw =new FileWriter(f);
			//Random rom = new Random();
			if(f.exists()){
			System.out.println("文件已存在。。du。");
			}else{
			f.createNewFile();
			}
			Random random = new Random();
			for(int i = 0; i < 100;i++) {
			System.out.println(Math.abs(random.nextInt())%100);
			fw.write(Math.abs(random.nextInt())%100+" ");
			}
			fw.flush();
			fw.close();
			} catch (IOException e) {
			e.printStackTrace();
			}
			}
	}