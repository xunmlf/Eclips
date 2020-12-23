package cn.duoxiancheng;
/**
 * 实现线程的第一种方式
 * @author lenovo
 *
 */
public class testThread {
	public static void main(String[] args) {
		
		 MyThread mt=new  MyThread();
		 
		 //启动线程
		 //start（）方法作用：启动一个分支线程，在JVM中开辟一个新的栈空间，瞬间结束
		 //启动成功会自动调用run方法，
		 
		 //输出结果有先有后，
		 mt.start();
		 //mt.run();不会启动线程，不会分配新的分支栈；
		 
		 
		 for(int i=0;i<1000;i++) {
			 System.out.println("主线程--->"+i);
		 }
	}

}

class MyThread extends Thread{
	@Override
	public void run() {
		
		//这段程序运行在分支线程中；
		for(int i=0;i<1000;i++) {
			System.out.println("分支线程--->"+i);
		}
	}
	
}
