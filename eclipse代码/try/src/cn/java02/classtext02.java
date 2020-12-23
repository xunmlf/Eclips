package cn.java02;

import java.util.Scanner;

/**
 * 
 * @author lenovo
 *
 */
public class classtext02 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("---欢迎进入作业提交系统---");
		System.out.print("请输入JAVA文件名：");
		String name=s.next();
		System.out.print("请输入邮箱：：");
		String email=s.next();
		if(name.lastIndexOf(".")==0){
			System.out.print("成功");
			if(email.indexOf("@")==0&&email.indexOf(".")>email.indexOf("@")) {
				System.out.print("成功");
			}else {
				System.out.println("Email无效");
				System.out.println("作业提交失败");
			}
		}else {
			System.out.println("JAVA文件名文件名错误");
			System.out.println("作业提交失败");
		}
		
		
	} 
	

}
