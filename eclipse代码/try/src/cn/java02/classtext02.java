package cn.java02;

import java.util.Scanner;

/**
 * 
 * @author lenovo
 *
 */
public class classtext02 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("---��ӭ������ҵ�ύϵͳ---");
		System.out.print("������JAVA�ļ�����");
		String name=s.next();
		System.out.print("���������䣺��");
		String email=s.next();
		if(name.lastIndexOf(".")==0){
			System.out.print("�ɹ�");
			if(email.indexOf("@")==0&&email.indexOf(".")>email.indexOf("@")) {
				System.out.print("�ɹ�");
			}else {
				System.out.println("Email��Ч");
				System.out.println("��ҵ�ύʧ��");
			}
		}else {
			System.out.println("JAVA�ļ����ļ�������");
			System.out.println("��ҵ�ύʧ��");
		}
		
		
	} 
	

}
