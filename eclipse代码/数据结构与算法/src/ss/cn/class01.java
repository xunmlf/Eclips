package ss.cn;

import java.io.FileNotFoundException;

class Child	{		//С���������
   int no;			//С�����
   Child next;			//ָ����һ�����ָ��
   public Child(int no1){		//���ع��췽��
      no=no1;
      next=null;
   }
}

class Joseph{			//���Լɪ��������
   int n,m;
   Child first;			//�׽��ָ��
   public Joseph(int n1,int m1){	//���췽��,������n1������ѭ��������
      Child p,t;			//tָ���½�ѭ���������β���
      n=n1; m=m1;		//�����ݳ�Աֵ
      first=new Child(1);	//�Ƚ���noΪ1���׽��
      t=first;
      for (int i=2;i<=n;i++){
         p=new Child(i);		//����һ�����Ϊi���½��p
         t.next=p; t=p;		//��p�������ĩβ
      }
      t.next=first;		//����һ���׽��Ϊfirst��ѭ��������
   }
   public String Jsequence(){	//���Լɪ������
      String ans="";
      int i,j;
      Child p,q;
      for (i=1;i<=n;i++){		//������n��С��
        p=first;
         j=1;
         while (j<m-1){		//��first��㿪ʼ������������m-1�����
            j++;			//��������
            p=p.next;		//�Ƶ���һ�����
         }
         q=p.next;		//qָ���m�����
         ans+=q.no+" ";		//�ý���С������
         p.next=q.next;		//ɾ��q���
         first=p.next;		//����һ��������¿�ʼ
      }
      return ans;
   }
}

public class class01 {
	public static void main(String[] args) throws FileNotFoundException{
	      System.out.println("********����1***********");
	      int n=6,m=3;
	      Joseph L=new Joseph(n,m);
	      System.out.println("n="+n+",m="+m+"��Լɪ������");
	      System.out.println(L.Jsequence());
	      System.out.println("********����2***********");
	      n=8; m=4;
	      L=new Joseph(n,m);
	      System.out.println("n="+n+",m="+m+"��Լɪ������");
	      System.out.println(L.Jsequence());
	      n=50; m=6;
	      L=new Joseph(n,m);
	      System.out.println("n="+n+",m="+m+"��Լɪ������");
	      System.out.println(L.Jsequence());
	   }	

}
