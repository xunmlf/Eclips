package leetcode.cn;

public class leetcode01 {
	public static void main(String[] args) {
		int a[]={2,3,5,7};
		int sum,tar = 8;
		for(int i=0;i<a.length;i++) {
			for(int j = i+1;j<a.length-i;j++) {
				sum=a[i]+a[j];
				if(sum==tar) {
					System.out.println("["+i+","+j+"]");
				}
			}
		}
		
	}

}
