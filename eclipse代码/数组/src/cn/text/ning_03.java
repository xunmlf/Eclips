package cn.text;

import java.util.Arrays;

/**
 * ��ά����
 * @author lenovo
 *
 */
public class ning_03 {
	public static void main(String[] args) {
		
		//1����ά����
		int a[][]=new int[3][];
		a[0]=new int[]{20,30};
		a[1]=new int[]{5,6,58};
		a[2]=new int[]{2,3};
		System.out.println(a[0][0]);
		
		System.out.println(a[0][0]);
		int b[][]= {
				    {5,56,585,5},
			     	{5,56,54},
			        {8458,58,55,959,5}};
		System.out.println(b[0][3]);
		
		//2:ʵ�ֶ�ά��������
		for(int[]  m:b) {
			System.out.println(Arrays.toString(m));
		}
		
		}
}
