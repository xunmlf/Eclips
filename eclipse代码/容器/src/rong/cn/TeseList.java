package rong.cn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *����Collection�ӿ��еķ���
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
			
			c.add("С��è");
			c.add("С����y");
			System.out.println(c);
			System.out.println(c.size());
			
			System.out.println(c.contains("С��è"));
			
			Object[] obj =c.toArray();
			System.out.println(obj);
			
			
			c.remove("С��è");
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
		 
		 list01.addAll(list02);//�ϲ�
		 System.out.println("list01"+list01);
		 
		 list01.removeAll(list02);//�Ƴ���ͬ����
		 System.out.println("list01"+list01);
		 
		 list01.retainAll(list02);//ȡ����
		 System.out.println("list01"+list01);
	}
	
	public static void tese03() {
		List <String> list=new ArrayList<String>();

		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		System.out.println(list);
		
		list.add(2,"С��è");//���±�Ϊ2������С��è��
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		
		list.set(2,"С��è");//���±�Ϊ2��Ԫ�ؽ����滻��
		System.out.println(list);
		
		System.out.println(list.get(2));//�����±�λ��Ԫ�أ�
		
		list.add("d");
		list.add("c");
		list.add("b");
		System.out.println(list);
		
		System.out.println(list.indexOf("b"));//���ص�һ�γ��ָ�Ԫ��ʱ������λ��
		System.out.println(list.lastIndexOf("b"));//�������һ�γ��ָ�Ԫ��ʱ��λ�ã�
		
	}
}
