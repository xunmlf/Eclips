package rong.cn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *测试Collection接口中的方法
 * @author lenovo
 *
 */
public class TeseList {
	public static void main(String[] args) {
		
		TeseList.tese02();
		
	}
	public static void tese01(){
		 Collection<String> c=new ArrayList<>();
			
			System.out.println(c.size());
			System.out.println(c.isEmpty());
			
			c.add("小花猫");
			c.add("小钢炮y");
			System.out.println(c);
			System.out.println(c.size());
			
			System.out.println(c.contains("小花猫"));
			
			Object[] obj =c.toArray();
			System.out.println(obj);
			
			
			c.remove("小花猫");
			System.out.println(c);
			
			c.clear();
			System.out.println(c.size());
	}

	public static void tese02() {
		 Collection<String> list01=new ArrayList<>();
		 list01.add("aa");
		 list01.add("bb");
		 list01.add("ss");
		 System.out.println("list01"+list01);
		 
		 Collection<String> list02=new ArrayList<>();
		 list02.add("aa");
		 list02.add("dd");
		 list02.add("rr");
		 System.out.println("list02"+list02);
		 
		 list01.addAll(list02);//合并
		 System.out.println("list01"+list01);
		 
		 list01.removeAll(list02);//移除相同部分
		 System.out.println("list01"+list01);
		 
		 list01.retainAll(list02);//取交集
		 System.out.println("list01"+list01);
	}
	
	public static void tese03() {
		List <String> list=new ArrayList<String>();

		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		System.out.println(list);
		
		list.add(2,"小花猫");//在下标为2处增加小花猫；
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		
		list.set(2,"小花猫");//将下标为2的元素进行替换；
		System.out.println(list);
		
		System.out.println(list.get(2));//返回下标位置元素；
		
		list.add("d");
		list.add("c");
		list.add("b");
		System.out.println(list);
		
		System.out.println(list.indexOf("b"));//返回第一次出现该元素时的索引位置
		System.out.println(list.lastIndexOf("b"));//返回最后一次出现该元素时的位置；
		
	}
}
