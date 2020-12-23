package cn.duoxiancheng;
/**
 * sleep方法
 * 让当前线程进入休眠状态，
 * @author lenovo
 *
 */
public class testThread03 {
	public static void main(String[] args) {
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		try {
			t.sleep(1000*5);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		r.fff=false;
		
	}
	

}

class MyRunnable implements Runnable{
	
	boolean fff=true;
	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++) {
			if(fff) {
			System.out.println(Thread.currentThread().getName()+"--->"+i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			}else {
				return;
			}
		}
		
	}
}