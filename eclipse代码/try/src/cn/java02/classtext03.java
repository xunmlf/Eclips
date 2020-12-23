package cn.java02;

import java.util.Scanner;

/**
 * 
 * @author lenovo
 *
 */
public class classtext03 {
	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.print("***欢迎进入注册系统***");
		System.out.println();
		while(true) {
		System.out.print("请输身份证:");
		String name=ss.next();
		System.out.print("请输入手机号：");
		String phone=ss.next();
		System.out.print("请输入电话机号：");
		String home=ss.next();
		if(name.length()==18||name.length()==16) {
			
		}else {
			System.out.println("身份证号必须是16位或18位！");
		}
		if(phone.length()==11) {
			
		}else {
			System.out.println("手机号码必须是11位！");
		}
		if(home.indexOf('-')==0 && home.substring(4,5)=="-") {
			System.out.println("注册成功！");
			break;
		}else {
			System.out.println("区号为为4，电话号码为7位！");
		}
	}
	}

}
