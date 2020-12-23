package cn.java02;

import java.util.Scanner;

/**
 * 
 * @author lenovo
 *
 */
public class classtext {
	public static void main(String[] args) {
		 Register a=new  Register();
		 a.verify();
	}

}

class Register{
	String name;
	String shu,shu2;
	void verify() {
		while(true) {
		System.out.println("***欢迎进入注册系统***");
		System.out.println();
		Scanner aa=new Scanner(System.in);
		System.out.println("请输入用户名");
		name=aa.next();
		System.out.println("请输入密码");
		shu=aa.next();
		System.out.println("请再次输入密码");
		shu2=aa.next();
		if(name.length()>=3&&shu.length()>=6) {
			if(shu.equals(shu2)) {
				System.out.println("注册成功！请牢记用户名和密码");
				break;
			}
			else {
				System.out.println("输入两次密码不同");
			}
		}else {
			System.out.println("用户名长度不能小于3，密码不能长度不能小于6");
		}
		
		}
	}
}