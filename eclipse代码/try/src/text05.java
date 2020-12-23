/**
 * 数组
 * @author lenovo
 *
 */


public class text05 {
	static int q=100;        //static修饰的是共享变量，静态变量，类变量；
	final double PI=3.14;//final修饰后PI的值不能再改动，成员变量；
	public void showMe(){
		
	}
	
	
	//构造方法,方法名和类名相同g
	text05(){
		System.out.println("55");
	}
	public static void main(String[] args) {
		new text05();
		System.out.println(text05.q);
		System.out.println();
	}

}
