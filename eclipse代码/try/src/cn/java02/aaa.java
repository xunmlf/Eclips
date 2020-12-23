package cn.java02;

import java.util.Scanner;

public class aaa {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个单词");
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
		System.out.println("元音有字母有"+j+"个");
		System.out.println("辅音字母有"+k+"个");
	}

}
