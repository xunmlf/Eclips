package cn.duoxiancheng;
/**
 * ʵ���̵߳ĵڶ��ַ�ʽ
 * 
 * ʹ�ñȽ϶࣬��Ϊ�ӿ��Ƕ�̳У�
 * @author lenovo
 *
 */
public class testThread02 {
	public static void main(String[] args) {
		
		//����һ�������ж���
		MyRunnable r=new MyRunnable();
		
		//�������ж����װ��һ���̶߳���
		Thread t=new Thread(r);
		
		
		//���߽�ϣ�Thread t=new Thread(new MyRunnable(););
		
		
		//�����߳�
		t.start();
		
		for(int i=0;i<100;i++) {
			System.out.println("���߳�--->"+i);
		}
		
	}

}

 /*class MyRunnable implements Runnable{
	 @Override
	public void run() {
		// TODO Auto-generated method stub
		 for(int i=0;i<100;i++) {
				System.out.println("��֧�߳�--->"+i);
			}
	}
	
}*/