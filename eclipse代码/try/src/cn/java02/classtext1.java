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
		System.out.print("请输入第一门课的成绩：");
		this.gard=s.nextInt();
		System.out.print("请输入第二门课的成绩：");
		this.gard=s.nextInt();
		System.out.print("请输入第三门课的成绩：");
		this.gard=s.nextInt();
		sum=gard+gard+gard;
		System.out.print("三门课的总成绩为："+sum+"\n");
		System.out.print("三门课的平均成绩为："+sum/3.0);
	}
}