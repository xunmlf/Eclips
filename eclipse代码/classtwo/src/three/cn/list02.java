package three.cn;

import java.util.*;

public class list02 {
	public static void main(String[] args) {
		List b=new ArrayList();
		b.add("aa");
		b.add("bb");
		b.add("cc");
		Collection d=new ArrayList();
		d.add("aa");
		d.add("ss");
		d.add("ww");
		System.out.println(d);
		System.out.println(b);
		//b.addAll(d);//元素合并
		b.removeAll(d);//移除相同元素
		System.out.println(b);
		
	}

}
