package cn.abc;

import java.io.FileInputStream;

public class sin02 {
	public static void main(String[] args) {
		sin02.tese01();
		sin02.tese02();
		sin02.tese03();
	}
		public static void tese01(){
			FileInputStream aaa=null;
			try {
				aaa=new FileInputStream("D:\\a.txt");
				/*while(true) {
					int a=aaa.read();//��һ���ֽ�
					if(a==-1) {
						break;
					}
					System.out.println(a);
				}*/
				int a=0;
				while((a=aaa.read())!=-1) {
					
					System.out.println(a);
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally {
				if(aaa!=null) {
					try {
						aaa.close();
					} catch (Exception e2) {
						// TODO: handle exception
						e2.printStackTrace();
					}
				}
			}
		}
	
		public static void tese02() {
			FileInputStream b=null;
			try {
				b=new FileInputStream("D:\\a.txt");
				byte[] bytes=new byte[3];
				/*while(true) {
					int s=b.read(bytes);//��ȡ���ַ�����
					if(s==-1) {
						break;
					}
					System.out.println(new String(bytes,0,s));
				}*/
				
				
				int s=0;
				while((s=b.read(bytes))!=-1) {
					System.out.println(new String(bytes,0,s));
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally {
				if(b!=null) {
					try {
						b.close();
					} catch (Exception e2) {
						// TODO: handle exception
						e2.printStackTrace();
					}
				}
			}
					
		}
		

		public static void tese03() {
			FileInputStream c=null;
			try {
				c=new FileInputStream("D:/a.txt");
				
				//c.available()��ȡʣ��ɶ�ȡ�ֽ�����
				
				/*System.out.println("���ֽ�����"+c.available());
				byte by[]=new byte[c.available()];//����������ļ���
				int cc=c.read(by);
				System.out.println(cc);
				System.out.println(new String(by));*/
				
				//c.skip()���������ֽڲ���ȡ
				c.skip(2);
				System.out.println(c.read());
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally{
				if(c!=null) {
					try {
						c.close();
					} catch (Exception e2) {
						// TODO: handle exception
						e2.printStackTrace();
					}
				}
			}
		}

}
		
