/**
 * �������
 * @author л��
 *
 */
//������
class Person{
	int age;
	double birthday;
	void people(){
		System.out.println("�Ұ�Java");
	}
}

class school{
	//��������--��Ա����
	String name;
	int classnumb;
	int labnumb;
	//���巽��--��Ա����
	void showMe() {
		System.out.println(name+"��"+classnumb+"������"+labnumb+"��ʵ����");
	}
	//���췽��
     school()/*������Ҫ��������ͬ*/{
		name="hua";
		classnumb=100;
	}
}

public class text01 {//������
	public static void main(String[] args) {
		Person p1=new Person();//����һ������
		p1.people();
		school s=new school();
		s.name="�������ְҵ������ѧ";
		s.classnumb=100;
		s.labnumb=100;
		s.showMe();
		System.out.println(s.name);
				
	}
	
}
