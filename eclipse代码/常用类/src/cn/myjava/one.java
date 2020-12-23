package cn.myjava;
/**
 * 测试包装类
 * Integer
 * @author lenovo
 *
 */
public class one {
	public static void main(String[] args) {
		
		//基本数据类型转成包装类对象
		Integer a=new Integer(3);
		Integer b=new Integer(50);
		System.out.println(a);
		
		//把包装类对像转成基本数据类型
		int c=b.intValue();
		double d=b.doubleValue();
		System.out.println(d);
		
		//把字符串转成包装类对象
		Integer e=new Integer("9999");
		Integer f=Integer.parseInt("999888");
		
		//把包装类对象转成字符串
		String str=f.toString();
		
		//常见的常量
		System.out.println("int类型最大的整数:"+Integer.MAX_VALUE);
	}

}
