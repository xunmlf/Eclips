package cn.java01;
/**
 *测试StringBuilder、StringBuffer可变字符序列
 * @author 
 *
 */


public class text_StringBuilder {
	public static void main(String[] args) {
		
//		//1:字符串的截取
		String str="aaabbbb";
		String str2=str.substring(2,3);
		System.out.println(str2);
//		
//		//2
//		System.out.println(str);
//		System.out.println(str2);
		
		
		//StringBuilder线程不安全，效率高（一般使用它）；StringBuffer线程安全，效率低。
		
//		StringBuilder sb=new StringBuilder("abcdefg");
//		
//		System.out.println(Integer.toHexString(sb.hashCode()));
//		System.out.println(sb);
//		
//		System.out.println("###############");
//		
//		sb.setCharAt(2, 'Q');
//		System.out.println(Integer.toHexString(sb.hashCode()));
//		System.out.println(sb);
		}
   }


