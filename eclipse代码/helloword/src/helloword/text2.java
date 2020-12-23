package helloword;

public class text2 {
	public static void main(String[] args) {
		double i=Math.random();
		System.out.println("* * * * * * *消费单* * * * * * *");
		System.out.print("购买物品"+"\t"+"单价"+"\t"+"个数"+"\t"+"金额\n");
		int gu1=(int)(10* Math.random());
		int gu2=(int)(10* Math.random());
		int gu3=(int)(10* Math.random());
		int j1=245*gu1;
		int j2=570*gu2;
		int j3=320*gu3;
		int sum=j1+j2+j3;
		int b=100000;
		int s=8;
		System.out.println("T恤"+"\t"+"￥245"+"\t"+gu1+"\t"+"￥"+j1+
		"\n"+"网球鞋"+"\t"+"￥570"+"\t"+gu2+"\t"+"￥"+j2+
		"\n"+"网球拍"+"\t"+"￥320"+"\t"+gu3+"\t"+"￥"+j3);
		System.out.println();
		System.out.println("折扣:"+"\t"+s+"折");
		System.out.println("消费总金额:"+"\t"+"￥"+sum*s/10);
		System.out.println("实际交费:"+"\t"+"￥"+b);
		System.out.println("找钱:"+"\t"+"￥"+(b-sum*s/10));
		
		System.out.println("本次购物所得积分:"+"\t"+(sum*s/10)/30);
	}

}
