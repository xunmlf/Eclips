package cn.java02;

import java.util.Scanner;

public class aaa {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("������һ������");
		String s=input.nextLine();
		int i=0;
		int j=0,k=0;
		for( i=0;i<s.length();i++) {
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
			j++;
		}
		else {
			k++;
		}
	}
		System.out.println("Ԫ������ĸ��"+j+"��");
		System.out.println("������ĸ��"+k+"��");
	}

}
