package helloword;

public class text2 {
	public static void main(String[] args) {
		double i=Math.random();
		System.out.println("* * * * * * *���ѵ�* * * * * * *");
		System.out.print("������Ʒ"+"\t"+"����"+"\t"+"����"+"\t"+"���\n");
		int gu1=(int)(10* Math.random());
		int gu2=(int)(10* Math.random());
		int gu3=(int)(10* Math.random());
		int j1=245*gu1;
		int j2=570*gu2;
		int j3=320*gu3;
		int sum=j1+j2+j3;
		int b=100000;
		int s=8;
		System.out.println("T��"+"\t"+"��245"+"\t"+gu1+"\t"+"��"+j1+
		"\n"+"����Ь"+"\t"+"��570"+"\t"+gu2+"\t"+"��"+j2+
		"\n"+"������"+"\t"+"��320"+"\t"+gu3+"\t"+"��"+j3);
		System.out.println();
		System.out.println("�ۿ�:"+"\t"+s+"��");
		System.out.println("�����ܽ��:"+"\t"+"��"+sum*s/10);
		System.out.println("ʵ�ʽ���:"+"\t"+"��"+b);
		System.out.println("��Ǯ:"+"\t"+"��"+(b-sum*s/10));
		
		System.out.println("���ι������û���:"+"\t"+(sum*s/10)/30);
	}

}
