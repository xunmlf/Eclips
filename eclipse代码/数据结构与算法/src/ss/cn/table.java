package ss.cn;

import java.util.Arrays;

public class table {
	public static void main(String[] args) {
	int a[]=new int[7];
	int b[]=new int[8];
	int i=0;
	int n=0;
	for(i=0;i<a.length;i++)
	{
		a[i]=(int)(Math.random()*100);
	}
	for(n=0;n<b.length;n++) {
		b[n]=(int)(Math.random()*100);
	}
	Arrays.sort(a);
	Arrays.sort(b);
	int[] c=con(a,b);
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(b));
	System.out.println(Arrays.toString(c));
}
	static int[] con(int[] a,int[] b) {
		int length=a.length+b.length;
		int c[]=new int[length];
		int l=0,k=0,j=0;//k表示a数组，j表示b数组
		while(k<a.length && j<b.length) {
			if(a[k]>b[j]) {
				c[l]=b[j];
				l++;
				j++;
			}else if(a[k]<b[j]) {
				c[l]=a[k];
				l++;
				k++;
			}else {
				c[l]=a[k];
				l++;
				k++;
				c[l]=b[j];
				l++;
				j++;
			}
		}
		while(j<b.length) {
			c[l]=b[j];
			l++;
			j++;
		}
		while(k<a.length) {
			c[l]=a[k];
			l++;
			k++;
		}
		return c;
	}

}
