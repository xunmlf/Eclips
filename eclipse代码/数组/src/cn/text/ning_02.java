package cn.text;
/**
 测试java.util.Arrays;工具类使用；
 * @author lenovo
 *
 */

import java.util.Arrays;

public class ning_02 {
	public static void main(String[] args) {
		int a[]= {10,30,20,60,2,1,45};
		//1：打印a的地址
		System.out.println(a);
		
		//2：数组的输出
		System.out.println(Arrays.toString(a));
		
		//3：排序
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		//4:数组的查找
		System.out.println(Arrays.binarySearch(a,30));//如果没有返回一个负数
	}

}