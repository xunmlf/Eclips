package helloword;

public class text3 {
	public static void main(String[] args) {
		student stu=new student();
		stu.name="momou";
		stu.rest();
		stu.study();
		
	}

}
 class person{
	 String name;
	 int hinght;
	 public void rest(){
		 System.out.println("ЪϢһ�ᣡ����");
	 }
 }
 class student extends person{
	 String major;
	 public void study() {
		 System.out.println("ѧϰ��Сʱ������");
	 }
 }