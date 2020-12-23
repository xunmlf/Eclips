package helloword;

import java.util.Scanner;

public class text5 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner a=new Scanner(System.in);
		int n=0;
		int i;
		System.out.print("输入班级人数：");
		int renshu=a.nextInt();
		for(i=1;i<=renshu;i++) {
			System.out.print("请输入第"+i+"位学生的成绩：");
			int chengji=a.nextInt();
			if(chengji<80) {
				break;
			}else {
				n++;
			}
		}
		System.out.println("80分以上的学生人数为："+n);
		double s=n*100/renshu;
		System.out.println("80分人数所占比："+s+"%");
	}
}
