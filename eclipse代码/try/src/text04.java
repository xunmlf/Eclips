
import java.util.Scanner;
class me{
	String name;
	int ma1;
	int ma2;
	void my() {
		Scanner s=new Scanner(System.in);
		System.out.print("�������û�����");
		String name=s.next();
		System.out.print("���������룺");
		int ma=s.nextInt();
		if(name.equals("admit" )&& ma==111111) {
			System.out.print("��¼�ɹ���");
			System.out.print("�����������룺");
			int ma1=s.nextInt();
			System.out.print("���ٴ��������룺");
			int ma2=s.nextInt();
			while(true) {
				if(ma2!=ma1) {
					System.out.println("��������������벻һ�£����������룡");
					System.out.print("�����������룺");
					ma1=s.nextInt();
					System.out.print("���ٴ����������룺");
					ma2=s.nextInt(); 
				}
				if(ma2==ma1) {
					System.out.println("�����������룺"+ma1+"\n"+"���ٴ����������룺"+ma2);
				    System.out.println("�޸�����ɹ�������������Ϊ��"+ma2);
				    break;
				}
			}
		}else {
			System.out.print("��¼�ɹ�ʧ�ܣ�");
			
		}
		System.out.println();
		
	
		
	}
	
}

public class text04 {
//	String name;
//	int ma1;
//	int ma2;
//	void my() {
//		Scanner s=new Scanner(System.in);
//		System.out.print("�������û�����");
//		String name=s.next();
//		System.out.print("���������룺");
//		int ma=s.nextInt();
//		if(name.equals("admit" )&& ma==111111) {
//			System.out.print("��¼�ɹ���");
//		}else {
//			System.out.print("��¼�ɹ�ʧ�ܣ�");
//			
//		}
//	}
//	
//	void me() {
//		Scanner s=new Scanner(System.in);
//		while(true) {
//			System.out.print("�����������룺");
//			int ma1=s.nextInt();
//			System.out.print("���ٴ��������룺");
//			int ma2=s.nextInt();
//			if(ma2!=ma1) {
//				System.out.println("��������������벻һ�£����������룡");
//				System.out.print("�����������룺");
//				ma1=s.nextInt();
//				System.out.print("���ٴ����������룺");
//				ma2=s.nextInt(); 
//			}
//			if(ma2==ma1) {
//				System.out.println("�����������룺"+ma1+"\n"+"���ٴ����������룺"+ma2);
//			    System.out.println("�޸�����ɹ�������������Ϊ��"+ma2);
//			    break;
//			}
//		}
//		
//	}
//	
	public static void main(String[] args) {
		
		me a=new me();
		a.my();
		
		
		
		
//		Scanner s=new Scanner(System.in);
//		System.out.print("�������û�����");
//		String name=s.next();
//		System.out.print("���������룺");
//		int ma=s.nextInt();
//		System.out.println();
//		System.out.print("�����������룺");
//		int ma1=s.nextInt();
//		System.out.print("���ٴ��������룺");
//		int ma2=s.nextInt();
//		while(true) {
//			if(ma2!=ma1) {
//				System.out.println("��������������벻һ�£����������룡");
//				System.out.print("�����������룺");
//				ma1=s.nextInt();
//				System.out.print("���ٴ����������룺");
//				ma2=s.nextInt(); 
//			}
//			if(ma2==ma1) {
//				System.out.println("�����������룺"+ma1+"\n"+"���ٴ����������룺"+ma2);
//			    System.out.println("�޸�����ɹ�������������Ϊ��"+ma2);
//			    break;
//			}
//		}
		
	}

}