package cn.text;

import java.util.Arrays;

/**
 * 多维数组
 * @author lenovo
 *
 */
public class ning_03 {
	public static void main(String[] args) {
		
		//1：二维数组
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
		
		//2:实现二维数组的输出
		for(int[]  m:b) {
			System.out.println(Arrays.toString(m));
		}
		
		}
}
