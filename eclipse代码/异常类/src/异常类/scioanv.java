package 异常类;

import java.util.Scanner;

public class scioanv {
	public static void main(String[] args) throws Exception {
		int grade;
		Scanner aa=new Scanner(System.in);
		grade=aa.nextInt();
		if(grade<0||grade>100) {
			throw new Exception("你的成绩无效");
		}else if(grade<60) {
			System.out.println("成绩不及格");
		}else{
			System.out.println("成绩及格");
		}
		
	}
	

}
