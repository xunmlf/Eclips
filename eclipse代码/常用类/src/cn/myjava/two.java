package cn.myjava;
/**
 * �����Զ�װ�䣬�Զ����䣻
 * @author lenovo
 *
 */
public class two {
	public static void main(String[] args) {
		
		//�Զ�װ��
		Integer a=234;   //Integer a=Integer.valueOf(234);
		
		//�Զ�����
		int b=a;        //�������Զ���Ϊ��int b=a.intValue();
		
		/*���桾-128��127��֮������֣�ʵ�ʾ���ϵͳ��ʼ��ʱ��
		�����ˡ�-128��127��֮���һ���������顣�����ǵ���valueOf������ʱ��
		�����ȼ���Ƿ��ڡ�-108��127��֮�䣬����������Χ��ֱ�Ӵӻ���������
		�ó��Ѿ����õĶ���������������Χ���򴴽��µ�Integer����*/
		
		
		//�ڡ�-128��127��֮�����
		Integer in1=Integer.valueOf(-128);
		Integer in2=-128;
		System.out.println(in1==in2);//true����Ϊ-128�ڷ�Χ��
		System.out.println(in1.equals(in2));//true
		
		System.out.println("###############");
		
		//���ڡ�-128��127��֮�����
		Integer in3=1234;
		Integer in4=1234;
		System.out.println(in3==in4);//false����Ϊ1234���ڷ�Χ��
		System.out.println(in3.equals(in4));//true
	}

}
