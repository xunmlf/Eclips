package cn.text;
/**
 ����java.util.Arrays;������ʹ�ã�
 * @author lenovo
 *
 */

import java.util.Arrays;

public class ning_02 {
	public static void main(String[] args) {
		int a[]= {10,30,20,60,2,1,45};
		//1����ӡa�ĵ�ַ
		System.out.println(a);
		
		//2����������
		System.out.println(Arrays.toString(a));
		
		//3������
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		//4:����Ĳ���
		System.out.println(Arrays.binarySearch(a,30));//���û�з���һ������
	}

}