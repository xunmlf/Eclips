package cn.text;

import java.util.Arrays;

/**
 * ��������洢������ݣ�
 * @author lenovo
 *
 */
public class ning_04 {
	public static void main(String[] args) {
		Object a[]= {1001,"����",18,"��ʦ","2006-6-6"};
		Object b[]= {1001,"��һ��",28,"����Ա","2016-9-6"};
		Object c[]= {1001,"�߶���",36,"����","2016-11-6"};
		
		Object d[][]=new Object[3][];
		d[0]=a;
		d[1]=b;
		d[2]=c;
		for(Object[] m:d) {
			System.out.println(Arrays.toString(m));
		}
	}
}
