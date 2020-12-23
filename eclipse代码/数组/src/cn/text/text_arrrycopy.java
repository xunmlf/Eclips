
package cn.text;

/**
 * 测试数组的用法
 * Array
 * @author lenovo
 *
 */
public class text_arrrycopy {
	public static void main(String[] args) {
		
//		//1：数组的删除（原则上是数组的拷贝）
//		String s3[]= {"AA","BB","CC","DD","EE"};
//		System.arraycopy(s3, 3, s3, 2,2);
//		s3[s3.length-1]=null;
//        for(int i=0;i<s3.length;i++) {
//			
//			System.out.println(i+"...."+s3[i]);
//		}
//		
		System.out.println("****************");
		
		//2：数组的拷贝
//		String s1[]= {"aa","bb","cc","dd"};
//		String s2[]= new String[10];
//		
//		System.arraycopy(s1/*数组名*/,2/*第一个数组的下标*/,s2/*数组名*/,6/*第二个数组的下标*/,2/*拷贝个数*/);//实现数组的拷贝
//		
//		for(int i=0;i<s2.length;i++) {
//			System.out.println(i+"...."+s2[i]);
//		}
		
		System.out.println("****************");
		
		//2：数组的删除（实质是数组的拷贝）
//		String s1[]= {"阿里","京东","尚学堂","百度","亚马逊"};
//     	String s2[]= new String[10];
//     	System.arraycopy(s1,2,s1,1,3);
//     	s1[s1.length-1]=null;
//     	for(int i=0;i<s1.length;i++) {
//     		System.out.println(s1[i]);
//     	}
		
		System.out.println("****************");
		
		//3：数组的扩容（数组的拷贝）
		String s1[]= {"aa","bb","cc","dd"};
 		String s2[]= new String[s1.length+5];
 		System.arraycopy(s1,0,s2,0,s1.length);
 		for(String m:s2) {
 			System.out.println(m);
 		}
  }
	
}
