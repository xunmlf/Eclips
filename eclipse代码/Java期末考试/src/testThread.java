
public class testThread {
	public static void main(String[] args) {
		Mythread t1=new Mythread("�߳�1");
		Mythread t2=new Mythread("�߳�2");
		t1.start();
		t2.start();
	}
}
class Mythread extends Thread{
	public Mythread(String name) {
		super(name);
	}
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(this.getName()+"ִ�е�"+i+"��");
			try {
				sleep(800);
			} catch (Exception e) {
				// TODO: handle exception
				
			}
		}
	}
}