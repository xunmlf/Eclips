package cn.abc;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *���л�
 * @author lenovo
 *
 *
 // transient�ؼ��ֱ�ʾ����ģ����������л�
  * private  transient String name;��ʾname���������л�
 */
//�������л��뷴���л��Ķ������ʵ��Serializable�ӿ�

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
		
		//����JAva����
		Student s=new Student(1111,"zhangsan");
		
		//���л�
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("d:/a.txt"));
		
		//���л�����
		oos.writeObject(s);
		
		//ˢ��
		oos.flush();
		
		//�ر�
		oos.close();
		
	}

}
