package cn.duoxiancheng;
/**
 * 实现线程的第二种方式
 * 
 * 使用比较多，因为接口是多继承，
 * @author lenovo
 *
 */
public class testThread02 {
	public static void main(String[] args) {
		
		//创建一个可运行对象
		MyRunnable r=new MyRunnable();
		
		//将可运行对象封装成一个线程对象
		Thread t=new Thread(r);
		
		
		//二者结合：Thread t=new Thread(new MyRunnable(););
		
		
		//启动线程
		t.start();
		
		for(int i=0;i<100;i++) {
			System.out.println("主线程--->"+i);
		}
		
	}

}

 /*class MyRunnable implements Runnable{
	 @Override
	public void run() {
		// TODO Auto-generated method stub
		 for(int i=0;i<100;i++) {
				System.out.println("分支线程--->"+i);
			}
	}
	
}*/