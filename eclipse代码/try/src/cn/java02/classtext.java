package cn.java02;

import java.util.Scanner;

/**
 * 
 * @author lenovo
 *
 */
public class classtext {
	public static void main(String[] args) {
		 Register a=new  Register();
		 a.verify();
	}

}

class Register{
	String name;
	String shu,shu2;
	void verify() {
		while(true) {
		System.out.println("***��ӭ����ע��ϵͳ***");
		System.out.println();
		Scanner aa=new Scanner(System.in);
		System.out.println("�������û���");
		name=aa.next();
		System.out.println("����������");
		shu=aa.next();
		System.out.println("���ٴ���������");
		shu2=aa.next();
		if(name.length()>=3&&shu.length()>=6) {
			if(shu.equals(shu2)) {
				System.out.println("ע��ɹ������μ��û���������");
				break;
			}
			else {
				System.out.println("�����������벻ͬ");
			}
		}else {
			System.out.println("�û������Ȳ���С��3�����벻�ܳ��Ȳ���С��6");
		}
		
		}
	}
}