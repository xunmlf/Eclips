package helloword;

import java.util.Scanner;

public class text5 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner a=new Scanner(System.in);
		int n=0;
		int i;
		System.out.print("����༶������");
		int renshu=a.nextInt();
		for(i=1;i<=renshu;i++) {
			System.out.print("�������"+i+"λѧ���ĳɼ���");
			int chengji=a.nextInt();
			if(chengji<80) {
				break;
			}else {
				n++;
			}
		}
		System.out.println("80�����ϵ�ѧ������Ϊ��"+n);
		double s=n*100/renshu;
		System.out.println("80��������ռ�ȣ�"+s+"%");
	}
}
