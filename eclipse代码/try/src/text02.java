
import java.util.Scanner;

class play{
	String name;
	int age;
	void showme() {
		if(age<10) {
			System.out.println(name+"������Ϊ:"+age+"\t"+"����Ʊ");
		}else {
		    System.out.println(name+"������Ϊ:"+age+"\t"+"��Ʊ20");
		}
	}
	 
}

public class text02 {
	public static void main(String[] args) {
		play p=new play();
		Scanner s=new Scanner(System.in);
		while(true) {	
		 System.out.print("����������");
		 p.name=s.next();
		 if(p.name.equals("n")) {
			 System.out.println("�������");
			 break;
		 }
		 System.out.print("����������");
		 p.age=s.nextInt();
		 p.showme();
	 }

   }
}