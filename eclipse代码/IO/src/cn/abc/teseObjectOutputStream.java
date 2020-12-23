package cn.abc;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *序列化
 * @author lenovo
 *
 *
 // transient关键字表示游离的，不参与序列化
  * private  transient String name;表示name不参与序列化
 */
//参与序列化与反序列化的对象必须实现Serializable接口

class Student implements Serializable{
	private int no;
	private String name;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int no,String name) {
		this.no=no;
		this.name=name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
public class teseObjectOutputStream {
	public static void main(String[] args) throws Exception{
		
		//创建JAva对象
		Student s=new Student(1111,"zhangsan");
		
		//序列化
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("d:/a.txt"));
		
		//序列化对象
		oos.writeObject(s);
		
		//刷新
		oos.flush();
		
		//关闭
		oos.close();
		
	}

}
