package �쳣��;

import java.util.Scanner;

public class scioanv {
	public static void main(String[] args) throws Exception {
		int grade;
		Scanner aa=new Scanner(System.in);
		grade=aa.nextInt();
		if(grade<0||grade>100) {
			throw new Exception("��ĳɼ���Ч");
		}else if(grade<60) {
			System.out.println("�ɼ�������");
		}else{
			System.out.println("�ɼ�����");
		}
		
	}
	

}
