/**
 * �޸�����
 */

import java.util.Scanner;

class user{
	String name;
	int ma;
	int ma2;
	int ma3;
} 

public class text03 {

	public static void main(String[] args) {
		int i=1;
		Scanner s=new Scanner(System.in);
		user u=new user();
		System.out.print("�������û�����");
		u.name=s.next();
		System.out.print("���������룺");
		u.ma=s.nextInt();
		System.out.println();
		System.out.print("�����������룺");
		u.ma2=s.nextInt();
		System.out.print("���ٴ����������룺");
		u.ma3=s.nextInt();
		while(true) {
		if(u.ma3!=u.ma2) {
			System.out.println("��������������벻һ�£����������룡");
			System.out.print("�����������룺");
			u.ma2=s.nextInt();
			System.out.print("���ٴ����������룺");
			u.ma3=s.nextInt(); 
		}
		if(u.ma3==u.ma2){
		    System.out.println("�����������룺"+u.ma2+"\n"+"���ٴ����������룺"+u.ma3);
		    System.out.println("�޸�����ɹ�������������Ϊ��"+u.ma3);
		    break;
	       }
		}
	}
}


