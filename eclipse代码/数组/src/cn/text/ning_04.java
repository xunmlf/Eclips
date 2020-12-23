package cn.text;

import java.util.Arrays;

/**
 * 测试数组存储表格数据；
 * @author lenovo
 *
 */
public class ning_04 {
	public static void main(String[] args) {
		Object a[]= {1001,"高琪",18,"讲师","2006-6-6"};
		Object b[]= {1001,"高一琪",28,"程序员","2016-9-6"};
		Object c[]= {1001,"高二琪",36,"销售","2016-11-6"};
		
		Object d[][]=new Object[3][];
		d[0]=a;
		d[1]=b;
		d[2]=c;
		for(Object[] m:d) {
			System.out.println(Arrays.toString(m));
		}
	}
}
