
import java.util.Scanner;

class play{
	String name;
	int age;
	void showme() {
		if(age<10) {
			System.out.println(name+"的年龄为:"+age+"\t"+"免门票");
		}else {
		    System.out.println(name+"的年龄为:"+age+"\t"+"门票20");
		}
	}
	 
}

public class text02 {
	public static void main(String[] args) {
		play p=new play();
		Scanner s=new Scanner(System.in);
		while(true) {	
		 System.out.print("请输入姓名");
		 p.name=s.next();
		 if(p.name.equals("n")) {
			 System.out.println("程序结束");
			 break;
		 }
		 System.out.print("请输入年龄");
		 p.age=s.nextInt();
		 p.showme();
	 }

   }
}