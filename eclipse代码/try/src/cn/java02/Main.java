package cn.java02;


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String a1=in.nextLine();
		String a2=in.nextLine();
		String a3=in.nextLine();
		String a4=in.nextLine();
		System.out.println("输入的16进制地址为："+a1+"."+a2+"."+a3+"."+a4);
		Integer b1=Integer.parseInt(a1,16);
		Integer b2=Integer.parseInt(a2,16);
		Integer b3=Integer.parseInt(a3,16);
		Integer b4=Integer.parseInt(a4,16);
		System.out.println("输出的10进制地址为："+b1+"."+b2+"."+b3+"."+b4);
		if(b1>0&&b1<127) {
			System.out.println("这是一个A类IP地址");
		}
		else if(b1>128&&b1<191) {
			System.out.println("这是一个B类IP地址");
		}
		else if(b1>192&&b1<223) {
			System.out.println("这是一个C类IP地址");
		}
		else if(b1>224&&b1<239) {
			System.out.println("这是一个D类IP地址");
		}
		else if(b1>240&&b1<255) {
			System.out.println("这是一个E类IP地址");
		}else {
			System.out.println("Other");
		}
	}

}
