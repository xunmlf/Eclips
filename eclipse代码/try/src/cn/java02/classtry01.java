package cn.java02;

class animal{
	void show() {
		System.out.println("我会动");
	}
}

class dog extends animal{
	void show() {
		System.out.println("我会跑");
	}
}

class fish extends animal{
	void show() {
		System.out.println("我会游");
	}
}

public class classtry01 {
	public static void main(String[] args) {
		animal aa=new animal();
		aa.show();
		animal bb=new dog();
		bb.show();
		animal cc=new fish();
		cc.show();
		person p=new person();
		p.setAge(18);
		System.out.print(p.getAge());
	}

}
