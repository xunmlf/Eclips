
package cn.text;

/**
 * ����������÷�
 * Array
 * @author lenovo
 *
 */
public class text_arrrycopy {
	public static void main(String[] args) {
		
//		//1�������ɾ����ԭ����������Ŀ�����
//		String s3[]= {"AA","BB","CC","DD","EE"};
//		System.arraycopy(s3, 3, s3, 2,2);
//		s3[s3.length-1]=null;
//        for(int i=0;i<s3.length;i++) {
//			
//			System.out.println(i+"...."+s3[i]);
//		}
//		
		System.out.println("****************");
		
		//2������Ŀ���
//		String s1[]= {"aa","bb","cc","dd"};
//		String s2[]= new String[10];
//		
//		System.arraycopy(s1/*������*/,2/*��һ��������±�*/,s2/*������*/,6/*�ڶ���������±�*/,2/*��������*/);//ʵ������Ŀ���
//		
//		for(int i=0;i<s2.length;i++) {
//			System.out.println(i+"...."+s2[i]);
//		}
		
		System.out.println("****************");
		
		//2�������ɾ����ʵ��������Ŀ�����
//		String s1[]= {"����","����","��ѧ��","�ٶ�","����ѷ"};
//     	String s2[]= new String[10];
//     	System.arraycopy(s1,2,s1,1,3);
//     	s1[s1.length-1]=null;
//     	for(int i=0;i<s1.length;i++) {
//     		System.out.println(s1[i]);
//     	}
		
		System.out.println("****************");
		
		//3����������ݣ�����Ŀ�����
		String s1[]= {"aa","bb","cc","dd"};
 		String s2[]= new String[s1.length+5];
 		System.arraycopy(s1,0,s2,0,s1.length);
 		for(String m:s2) {
 			System.out.println(m);
 		}
  }
	
}
