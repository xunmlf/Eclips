package a;
import java.util.Scanner;

public class text {
	public static void main(String[] args) {
		Scanner a;
		a=new Scanner(System.in);
		System.out.print("������");
		String name=a.next();
		System.out.print("stb�ĳɼ�Ϊ��");
		int b=a.nextInt();
		System.out.print("java�ĳɼ�Ϊ��");
		int c=a.nextInt();
		System.out.print("sql�ĳɼ�Ϊ��");
		int d=a.nextInt();
		System.out.println("-----------------------------");
		System.out.println("stb\t"+"java\t"+"sql");
		System.out.println(b+"\t"+c+"\t"+d);
		System.out.println("-----------------------------");
		System.out.println("java��sql�ĳɼ���Ϊ:"+(c-d));
		System.out.println("ƽ���ɼ�Ϊ��"+(b+c+d)/3);
	}

}
