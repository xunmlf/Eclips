package cn.java02;

import java.util.Scanner;

public class classtext1 {
	public static void main(String[] args) {
		score a=new score();
		a.fang();
	}

}

class score{
	
	String name;
	int gard;
	int sum;
	
	void fang() {
		Scanner s=new Scanner(System.in);
		System.out.print("�������һ�ſεĳɼ���");
		this.gard=s.nextInt();
		System.out.print("������ڶ��ſεĳɼ���");
		this.gard=s.nextInt();
		System.out.print("����������ſεĳɼ���");
		this.gard=s.nextInt();
		sum=gard+gard+gard;
		System.out.print("���ſε��ܳɼ�Ϊ��"+sum+"\n");
		System.out.print("���ſε�ƽ���ɼ�Ϊ��"+sum/3.0);
	}
}