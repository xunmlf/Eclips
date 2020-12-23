package ss.cn;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class class02 {
	public static void main(String[] args) {
		 ArrayList<String> c=new ArrayList<String>();
		 c.add("A");
		 c.add("B");
		 c.add("C");
		 c.add("D");
		 c.add("E");
		 System.out.println("myarraylist:" +c);
		 System.out.println("myarraylist:" +c.size());
		 System.out.println("myarraylist:"+c.indexOf("B"));//返回第一次出现该元素时的索引位置
		 System.out.println("myarraylist:"+c.get(1));
		 LinkedList<String> b=new LinkedList<String>(c);
		 System.out.println("LInklist:"+b);
		 b.clear();
		 b.add("1");
		 b.add("2");
		 b.add("3");
		 b.add("4");
		 b.add("5");
		 System.out.println("LInklist:"+b);
		 System.out.println("myarraylist:" +c.size());
		 c=new ArrayList<String>(b);
		 System.out.println("myarraylist:" +c);
		 System.out.println("myarraylist:"+c.indexOf("2"));//返回第一次出现该元素时的索引位置
		 
		 
		 
		 
	}

}
