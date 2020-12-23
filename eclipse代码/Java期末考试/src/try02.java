
public class try02 {
	public static void main(String[] args) {
		int i,j,t;
		int a[]=new int[10];
		for(i=0;i<10;i++) {
			a[i]=(int) (Math.random()*10);
		}
		for(i=1;i<a.length;i++) {
			for(j=0;j<a.length-i;j++) {
				if(a[j]>a[j+1]) {
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		System.out.print("从小到大排序为：");
		for(int m:a) {
			System.out.print(m+" ");
			
		}
	}

}
