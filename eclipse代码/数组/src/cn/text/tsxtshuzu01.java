package cn.text;

import java.util.Scanner;

/**
 * 
 * @author lenovo
 *
 */
public class tsxtshuzu01 {
	public static void main(String[] args) {
		int a[]=new int[5];
		int sum=0;
		Scanner in=new Scanner(System.in);
		System.out.println("������5λѧԱ�ĵĳɼ���");
	    for(int i=0;i<5;i++) {
	    	a[i]=in.nextInt();
	    	sum=sum+a[i];
	    }
	    System.out.println("5λѧԱ�ĵ�ƽ���ɼ��ǣ�"+sum/5);
	    System.out.println("������Ҫ��ѯ�Ŀγ̣�");
	    int num=in.nextInt();
	    System.out.println("��"+num+"�ɼ���:"+a[num-1]);
	}
}
