/**
 * 面向对象
 * @author 谢宁
 *
 */
//定义类
class Person{
	int age;
	double birthday;
	void people(){
		System.out.println("我爱Java");
	}
}

class school{
	//定义属性--成员属性
	String name;
	int classnumb;
	int labnumb;
	//定义方法--成员方法
	void showMe() {
		System.out.println(name+"有"+classnumb+"个教室"+labnumb+"个实验室");
	}
	//构造方法
     school()/*方法名要和类名相同*/{
		name="hua";
		classnumb=100;
	}
}

public class text01 {//公共类
	public static void main(String[] args) {
		Person p1=new Person();//创建一个对象
		p1.people();
		school s=new school();
		s.name="江西软件职业技术大学";
		s.classnumb=100;
		s.labnumb=100;
		s.showMe();
		System.out.println(s.name);
				
	}
	
}
