package cn.myjava;
/**
 * ���԰�װ��
 * Integer
 * @author lenovo
 *
 */
public class one {
	public static void main(String[] args) {
		
		//������������ת�ɰ�װ�����
		Integer a=new Integer(3);
		Integer b=new Integer(50);
		System.out.println(a);
		
		//�Ѱ�װ�����ת�ɻ�����������
		int c=b.intValue();
		double d=b.doubleValue();
		System.out.println(d);
		
		//���ַ���ת�ɰ�װ�����
		Integer e=new Integer("9999");
		Integer f=Integer.parseInt("999888");
		
		//�Ѱ�װ�����ת���ַ���
		String str=f.toString();
		
		//�����ĳ���
		System.out.println("int������������:"+Integer.MAX_VALUE);
	}

}
