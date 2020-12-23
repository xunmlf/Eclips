package classtwo.cn;

public class try01 {
	public static void main(String[] args) {
		int num[]= {2,7,11,25};
		int target=9;
		int n=0;
		for(int i=0;i<num.length;i++) {
			for(int j=1;j<num.length;j++) {
				int sum=num[i]+num[j];
				if(sum==target) {
					n++;
					System.out.println("["+i+","+j+"]");
				}
			}
			
		}
		if(n==0){
			System.out.println(-1);
			
		}
		
	}

}
