package cn.java02;
/**
 * 
 * @author lenovo
 *
 */
class father{
	 father() {
		System.out.println("成绩情况");
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
			System.out.println("第"+(i+1)+"个同学对"+c+"个");
			
		}
		System.out.println(a.toString());
		
	}

}












;