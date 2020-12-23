package classtwo.cn;

public class ½ğ×ÖËş {
	public static void main(String[] args) {
		int a[][]=new int[8][17];
		for(int i=1;i<=9;i++) {
			for(int j=0;j<=9-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				a[0][9]=1;
				a[i-1][k-1]=a[i][k]+1;
				a[i+1][k+1]=a[i][k]+1;
				System.out.print(a[i][k]);
			}
			System.out.println();
		}
	}

}
