package cn.java02;

class person{
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class fengZhuang {
	public void main(String[] args) {
		person p=new person();
		p.setAge(18);
		System.out.println(p.getAge());
	}

}
