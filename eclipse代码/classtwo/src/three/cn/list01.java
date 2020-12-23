package three.cn;

import java.util.*;

public class list01 {
	
	private Object e[]=new Object[10];;
	private int lingth;
	/*public  list01() {
		e=new Object[10];
	}*/
	public void add(Object obj) {
		e[lingth]=obj;
		lingth++;
	}
	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<lingth;i++) {
			sb.append(e[i]+" ");
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		list01 li=new list01();
		li.add("s");
		li.add("t");
		li.add("u");
		li.add("d");;
		li.add("y");;
		System.out.println(li);
	 
 }
}
