package cn.text;

import java.util.Scanner;

/**
 * 
 * @author lenovo
 *
 */
public class textshuzhu02 {
	public static void main(String[] args) {
		int a[]= {8,4,2,1,233,344,12};
		int sum=0;
		int i;
		Scanner in=new Scanner(System.in);
		for(i=0;i<7;i++) {
			System.out.print(a[i]+",");
			sum+=a[i];
		}
		System.out.println();
		System.out.println(sum);
		 
		for(int j=0;j<7;j++) {
			System.out.println("������Ҫ��ѯ������");
	         a[j]=in.nextInt();
			if(a[i]==a[j]) {
				System.out.println("����"+a[j]+"��������");
			}else {
				System.out.println("����"+a[j]+"��������");
			}
		}
	}

}
