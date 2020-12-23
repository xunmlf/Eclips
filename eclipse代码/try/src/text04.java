
import java.util.Scanner;
class me{
	String name;
	int ma1;
	int ma2;
	void my() {
		Scanner s=new Scanner(System.in);
		System.out.print("请输入用户名：");
		String name=s.next();
		System.out.print("请输入密码：");
		int ma=s.nextInt();
		if(name.equals("admit" )&& ma==111111) {
			System.out.print("登录成功！");
			System.out.print("请输入新密码：");
			int ma1=s.nextInt();
			System.out.print("请再次输入密码：");
			int ma2=s.nextInt();
			while(true) {
				if(ma2!=ma1) {
					System.out.println("您两次输入的密码不一致，请重新输入！");
					System.out.print("请输入新密码：");
					ma1=s.nextInt();
					System.out.print("请再次输入新密码：");
					ma2=s.nextInt(); 
				}
				if(ma2==ma1) {
					System.out.println("请输入新密码："+ma1+"\n"+"请再次输入新密码："+ma2);
				    System.out.println("修改密码成功，您的新密码为："+ma2);
				    break;
				}
			}
		}else {
			System.out.print("登录成功失败！");
			
		}
		System.out.println();
		
	
		
	}
	
}

public class text04 {
//	String name;
//	int ma1;
//	int ma2;
//	void my() {
//		Scanner s=new Scanner(System.in);
//		System.out.print("请输入用户名：");
//		String name=s.next();
//		System.out.print("请输入密码：");
//		int ma=s.nextInt();
//		if(name.equals("admit" )&& ma==111111) {
//			System.out.print("登录成功！");
//		}else {
//			System.out.print("登录成功失败！");
//			
//		}
//	}
//	
//	void me() {
//		Scanner s=new Scanner(System.in);
//		while(true) {
//			System.out.print("请输入新密码：");
//			int ma1=s.nextInt();
//			System.out.print("请再次输入密码：");
//			int ma2=s.nextInt();
//			if(ma2!=ma1) {
//				System.out.println("您两次输入的密码不一致，请重新输入！");
//				System.out.print("请输入新密码：");
//				ma1=s.nextInt();
//				System.out.print("请再次输入新密码：");
//				ma2=s.nextInt(); 
//			}
//			if(ma2==ma1) {
//				System.out.println("请输入新密码："+ma1+"\n"+"请再次输入新密码："+ma2);
//			    System.out.println("修改密码成功，您的新密码为："+ma2);
//			    break;
//			}
//		}
//		
//	}
//	
	public static void main(String[] args) {
		
		me a=new me();
		a.my();
		
		
		
		
//		Scanner s=new Scanner(System.in);
//		System.out.print("请输入用户名：");
//		String name=s.next();
//		System.out.print("请输入密码：");
//		int ma=s.nextInt();
//		System.out.println();
//		System.out.print("请输入新密码：");
//		int ma1=s.nextInt();
//		System.out.print("请再次输入密码：");
//		int ma2=s.nextInt();
//		while(true) {
//			if(ma2!=ma1) {
//				System.out.println("您两次输入的密码不一致，请重新输入！");
//				System.out.print("请输入新密码：");
//				ma1=s.nextInt();
//				System.out.print("请再次输入新密码：");
//				ma2=s.nextInt(); 
//			}
//			if(ma2==ma1) {
//				System.out.println("请输入新密码："+ma1+"\n"+"请再次输入新密码："+ma2);
//			    System.out.println("修改密码成功，您的新密码为："+ma2);
//			    break;
//			}
//		}
		
	}

}