package ss.cn;

class SqStackClass<E>	//˳��ջ������
{  final int initcapacity=10;	//˳��ջ�ĳ�ʼ����(����)
   private int capacity;    	//���˳��ջ������
   private E[] data;		//���˳��ջ��Ԫ��
   private int top;    		//���ջ��ָ��
   public SqStackClass()		//���췽����ʵ��data��size�ĳ�ʼ��
   {  data = (E[])new Object[initcapacity];     //ǿ��ת��ΪE��������
      capacity=initcapacity;
      top=-1;
   }		
   private void updatecapacity(int newcapacity)	//�ı�ջ����
   {  E[] newdata = (E[])new Object[newcapacity];
      for (int i=0;i<top;i++)	//����ԭ����Ԫ��
         newdata[i]=data[i];
      capacity=newcapacity;	//����������
      data=newdata;		//����data��ʶ����
   }
   //ջ�Ļ��������㷨
   public boolean empty()		//�ж�ջ�Ƿ�Ϊ��
   {
      return top==-1;
   }
   public void push(E e)		//Ԫ��e��ջ
   {  if (top==capacity-1)		//˳��ջ�ռ���ʱ��������
         updatecapacity(2*(top+1));
      top++;			//ջ��ָ����1
      data[top]=e;
   }
   public E pop()					//��ջ����
   {  if (empty())
        throw new IllegalArgumentException("ջ��");
      E e=(E)data[top];
      top--;
      if (top+1>initcapacity && top+1==capacity/4)	//����������������
         updatecapacity(capacity/2);
      return e;
   }
   public E peek()		//ȡջ��Ԫ�ز���
   {  if (empty())
        throw new IllegalArgumentException("ջ��");
      return (E)data[top];
   }

}


public class class03 {
	public static boolean isMatch(String str)	//�ж��㷨
	   {  int i=0;
	      char e,x;
	      SqStackClass<Character> st=new SqStackClass<Character>();	
	           					//����һ��˳��ջ
	      while (i<str.length())
	      {  e=str.charAt(i);
	         if (e=='(' || e=='[' || e=='{')
	            st.push(e);				//�������Ž�ջ
	         else
	         {  if (e==')')
	            {  if (st.empty()) return false;		//ջ�շ���false
	               if (st.peek()!='(') return false;	//ջ����ƥ�䷵�ؼ�
	               st.pop();
	            }
	            if (e==']')
	            {  if (st.empty()) return false;		//ջ�շ���false
	               if (st.peek()!='[') return false;	//ջ����ƥ�䷵�ؼ�
	               st.pop();
	            }
	            if (e=='}')
	            {  if (st.empty()) return false;		//ջ�շ���false
	               if (st.peek()!='{') return false;	//ջ����ƥ�䷵�ؼ�
	               st.pop();
	            }
	         }
	         i++;					//��������str	 
	      }
	      if (st.empty()) return true;			//ջ�շ���true
	      else return false;				//ջ���շ���false
	   }


	public static void main(String[] args)
	   {  System.out.println("����1");
	      String str="([)]";
	      if (isMatch(str)) System.out.println(str+"��������ƥ���");
	      else System.out.println(str+"�����Ų�ƥ��");
	      System.out.println("����2");
	      str="([])";
	      if (isMatch(str)) 	System.out.println(str+"��������ƥ���");
	      else System.out.println(str+"�����Ų�ƥ��");
	   }
	}

