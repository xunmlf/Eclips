package helloword;
import java.util.Scanner;
public class text4 {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		int i;
		System.out.println("MYshopping����ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ\n");
		for(i=0;i<3;i++) {
			System.out.print("�������Ա��<4λ��>��");
			int zhengshu=a.nextInt();
			System.out.print("�������Ա���գ�");
			String birth=a.next();
			System.out.print("�������Ա����");
			int jifen=a.nextInt();
			if(zhengshu>999&&zhengshu<10000) {
				System.out.println("������Ļ�Ա��Ϣ�ǣ�");
				System.out.println(zhengshu+"\t"+birth+"\t"+jifen);
			}
			else {
				System.out.println("�ͻ�"+zhengshu+"����Ч��Ա��\n"+"¼����Ϣʧ��");
			}
			System.out.println();
		}
		System.out.println("�������!");
	}
}
