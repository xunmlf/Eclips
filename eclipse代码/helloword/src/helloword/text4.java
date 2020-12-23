package helloword;
import java.util.Scanner;
public class text4 {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		int i;
		System.out.println("MYshopping购物系统>客户信息管理>添加客户信息\n");
		for(i=0;i<3;i++) {
			System.out.print("请输入会员号<4位数>：");
			int zhengshu=a.nextInt();
			System.out.print("请输入会员生日：");
			String birth=a.next();
			System.out.print("请输入会员积分");
			int jifen=a.nextInt();
			if(zhengshu>999&&zhengshu<10000) {
				System.out.println("您登入的会员信息是：");
				System.out.println(zhengshu+"\t"+birth+"\t"+jifen);
			}
			else {
				System.out.println("客户"+zhengshu+"是无效会员号\n"+"录入信息失败");
			}
			System.out.println();
		}
		System.out.println("程序结束!");
	}
}
