package cn.java02;

import java.util.Scanner;

/**
 * 
 * @author lenovo
 *
 */
public class classtext03 {
	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.print("***��ӭ����ע��ϵͳ***");
		System.out.println();
		while(true) {
		System.out.print("�������֤:");
		String name=ss.next();
		System.out.print("�������ֻ��ţ�");
		String phone=ss.next();
		System.out.print("������绰���ţ�");
		String home=ss.next();
		if(name.length()==18||name.length()==16) {
			
		}else {
			System.out.println("���֤�ű�����16λ��18λ��");
		}
		if(phone.length()==11) {
			
		}else {
			System.out.println("�ֻ����������11λ��");
		}
		if(home.indexOf('-')==0 && home.substring(4,5)=="-") {
			System.out.println("ע��ɹ���");
			break;
		}else {
			System.out.println("����ΪΪ4���绰����Ϊ7λ��");
		}
	}
	}

}
