package cn.java02;
/**
 * 
 * @author lenovo
 *
 */
class father{
	 father() {
		System.out.println("�ɼ����");
	}
}

class son extends father{
	
}
public class classtext04 {
	public static void main(String[] args) {
		char a[][]= {
				{'A','C','B','D','A','B','C','D','A'},
		        {'A','C','D','D','C','B','C','D','A'},
		        {'A','C','D','D','C','B','C','D','A'},
		        };
		char b[]= {'A','C','D','D','C','A','C','B','A'};
	      new father();
		for(int i=0;i<a.length;i++) {
			int c=0;
			for(int j=0;j<b.length;j++) {
				if(a[i][j]==b[j]) {
					c++;
				}
			}
			System.out.println("��"+(i+1)+"��ͬѧ��"+c+"��");
			
		}
		System.out.println(a.toString());
		
	}

}












;