package cn.duoxiancheng;
/**
 * ʵ���̵߳ĵ�һ�ַ�ʽ
 * @author lenovo
 *
 */
public class testThread {
	public static void main(String[] args) {
		
		 MyThread mt=new  MyThread();
		 
		 //�����߳�
		 //start�����������ã�����һ����֧�̣߳���JVM�п���һ���µ�ջ�ռ䣬˲�����
		 //�����ɹ����Զ�����run������
		 
		 //�����������к�
		 mt.start();
		 //mt.run();���������̣߳���������µķ�֧ջ��
		 
		 
		 for(int i=0;i<1000;i++) {
			 System.out.println("���߳�--->"+i);
		 }
	}

}

class MyThread extends Thread{
	@Override
	public void run() {
		
		//��γ��������ڷ�֧�߳��У�
		for(int i=0;i<1000;i++) {
			System.out.println("��֧�߳�--->"+i);
		}
	}
	
}
