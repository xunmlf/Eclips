package cn.java01;
/**
 * ����StringBuilder���÷�
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
		
		//1;����
		sb.reverse();
		System.out.println(sb);
		
		System.out.println("###############");
		
		//2;����
		sb.setCharAt(2, 'Q');
		System.out.println(sb);
		sb.insert(0,"��").insert(1,"��").insert(2, "��");  //����ʽ����         
		System.out.println(sb);
		
		System.out.println("###############");
		
		//3;ɾ��
		sb.delete(20, 26);
		System.out.println(sb);
	}

}
