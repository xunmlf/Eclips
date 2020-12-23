/**
 * 修改密码
 */

import java.util.Scanner;

class user{
	String name;
	int ma;
	int ma2;
	int ma3;
} 

public class text03 {

	public static void main(String[] args) {
		int i=1;
		Scanner s=new Scanner(System.in);
		user u=new user();
		System.out.print("请输入用户名：");
		u.name=s.next();
		System.out.print("请输入密码：");
		u.ma=s.nextInt();
		System.out.println();
		System.out.print("请输入新密码：");
		u.ma2=s.nextInt();
		System.out.print("请再次输入新密码：");
		u.ma3=s.nextInt();
		while(true) {
		if(u.ma3!=u.ma2) {
			System.out.println("您两次输入的密码不一致，请重新输入！");
			System.out.print("请输入新密码：");
			u.ma2=s.nextInt();
			System.out.print("请再次输入新密码：");
			u.ma3=s.nextInt(); 
		}
		if(u.ma3==u.ma2){
		    System.out.println("请输入新密码："+u.ma2+"\n"+"请再次输入新密码："+u.ma3);
		    System.out.println("修改密码成功，您的新密码为："+u.ma3);
		    break;
	       }
		}
	}
}


