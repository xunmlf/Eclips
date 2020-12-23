package a;
import java.util.Scanner;

public class text {
	public static void main(String[] args) {
		Scanner a;
		a=new Scanner(System.in);
		System.out.print("姓名：");
		String name=a.next();
		System.out.print("stb的成绩为：");
		int b=a.nextInt();
		System.out.print("java的成绩为：");
		int c=a.nextInt();
		System.out.print("sql的成绩为：");
		int d=a.nextInt();
		System.out.println("-----------------------------");
		System.out.println("stb\t"+"java\t"+"sql");
		System.out.println(b+"\t"+c+"\t"+d);
		System.out.println("-----------------------------");
		System.out.println("java和sql的成绩差为:"+(c-d));
		System.out.println("平均成绩为："+(b+c+d)/3);
	}

}
