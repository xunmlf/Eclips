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
		 System.out.println("myarraylist:"+c.indexOf("B"));//���ص�һ�γ��ָ�Ԫ��ʱ������λ��
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
		 System.out.println("myarraylist:"+c.indexOf("2"));//���ص�һ�γ��ָ�Ԫ��ʱ������λ��
		 
		 
		 
		 
	}

}
