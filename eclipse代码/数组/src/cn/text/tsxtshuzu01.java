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
		System.out.println("请输入5位学员的的成绩：");
	    for(int i=0;i<5;i++) {
	    	a[i]=in.nextInt();
	    	sum=sum+a[i];
	    }
	    System.out.println("5位学员的的平均成绩是："+sum/5);
	    System.out.println("请输入要查询的课程：");
	    int num=in.nextInt();
	    System.out.println("第"+num+"成绩是:"+a[num-1]);
	}
}
