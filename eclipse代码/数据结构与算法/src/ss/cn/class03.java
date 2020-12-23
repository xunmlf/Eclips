package ss.cn;

class SqStackClass<E>	//顺序栈泛型类
{  final int initcapacity=10;	//顺序栈的初始容量(常量)
   private int capacity;    	//存放顺序栈的容量
   private E[] data;		//存放顺序栈中元素
   private int top;    		//存放栈顶指针
   public SqStackClass()		//构造方法，实现data和size的初始化
   {  data = (E[])new Object[initcapacity];     //强制转换为E类型数组
      capacity=initcapacity;
      top=-1;
   }		
   private void updatecapacity(int newcapacity)	//改变栈容量
   {  E[] newdata = (E[])new Object[newcapacity];
      for (int i=0;i<top;i++)	//复制原来的元素
         newdata[i]=data[i];
      capacity=newcapacity;	//设置新容量
      data=newdata;		//仍由data标识数组
   }
   //栈的基本运算算法
   public boolean empty()		//判断栈是否为空
   {
      return top==-1;
   }
   public void push(E e)		//元素e进栈
   {  if (top==capacity-1)		//顺序栈空间满时倍增容量
         updatecapacity(2*(top+1));
      top++;			//栈顶指针增1
      data[top]=e;
   }
   public E pop()					//出栈操作
   {  if (empty())
        throw new IllegalArgumentException("栈空");
      E e=(E)data[top];
      top--;
      if (top+1>initcapacity && top+1==capacity/4)	//满足条件容量减半
         updatecapacity(capacity/2);
      return e;
   }
   public E peek()		//取栈顶元素操作
   {  if (empty())
        throw new IllegalArgumentException("栈空");
      return (E)data[top];
   }

}


public class class03 {
	public static boolean isMatch(String str)	//判断算法
	   {  int i=0;
	      char e,x;
	      SqStackClass<Character> st=new SqStackClass<Character>();	
	           					//建立一个顺序栈
	      while (i<str.length())
	      {  e=str.charAt(i);
	         if (e=='(' || e=='[' || e=='{')
	            st.push(e);				//将左括号进栈
	         else
	         {  if (e==')')
	            {  if (st.empty()) return false;		//栈空返回false
	               if (st.peek()!='(') return false;	//栈顶不匹配返回假
	               st.pop();
	            }
	            if (e==']')
	            {  if (st.empty()) return false;		//栈空返回false
	               if (st.peek()!='[') return false;	//栈顶不匹配返回假
	               st.pop();
	            }
	            if (e=='}')
	            {  if (st.empty()) return false;		//栈空返回false
	               if (st.peek()!='{') return false;	//栈顶不匹配返回假
	               st.pop();
	            }
	         }
	         i++;					//继续遍历str	 
	      }
	      if (st.empty()) return true;			//栈空返回true
	      else return false;				//栈不空返回false
	   }


	public static void main(String[] args)
	   {  System.out.println("测试1");
	      String str="([)]";
	      if (isMatch(str)) System.out.println(str+"中括号是匹配的");
	      else System.out.println(str+"中括号不匹配");
	      System.out.println("测试2");
	      str="([])";
	      if (isMatch(str)) 	System.out.println(str+"中括号是匹配的");
	      else System.out.println(str+"中括号不匹配");
	   }
	}

