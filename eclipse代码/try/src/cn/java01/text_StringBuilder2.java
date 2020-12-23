package cn.java01;
/**
 * 测试StringBuilder的用法
 * @author lenovo
 *
 */
public class text_StringBuilder2 {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<26;i++) {
			char t=(char)('a'+i);
			sb.append(t);
		}
		System.out.println(sb);
		
		System.out.println("###############");
		
		//1;倒序
		sb.reverse();
		System.out.println(sb);
		
		System.out.println("###############");
		
		//2;插入
		sb.setCharAt(2, 'Q');
		System.out.println(sb);
		sb.insert(0,"我").insert(1,"爱").insert(2, "你");  //可链式调用         
		System.out.println(sb);
		
		System.out.println("###############");
		
		//3;删除
		sb.delete(20, 26);
		System.out.println(sb);
	}

}
