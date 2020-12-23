package cn.abc;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * ∑¥–Ú¡–ªØ
 * @author lenovo
 *
 */
public class teseObjectInputStream {
	public static void main(String[] args) throws Exception{
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:/a.txt"));
	
		Object obj=ois.readObject();
		System.out.println(obj);
		ois.close();
	
	}

}
