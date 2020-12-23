package cn.text;


/**
二分法查找元素 (数组要排好序)
 * @author lenovo
 *
 */
import java.util.Arrays;

public class ning_08 {
	public static void main(String[] args) {
		int a[]= {50,7,66,9,1,10,45,100,12};
		Arrays.sort(a);     //数组排好序
		System.out.println(Arrays.toString(a));
		erFenFa(a,45);
	}


    public static void erFenFa(int[] a,int b) {
	   int low=0;
	   int high=a.length-1;
	   
	   while(low<high) {
		   int mid=(low+high)/2;
		   if(b==a[mid]) {
			   System.out.println(mid);
			   }
		   if(b>a[mid]) {
			   low=mid+1; 
			   }
		   if(b<a[mid]) {
			   high=mid-1;
			   System.out.println(high);
			   }
		   }
	   }
	   
   }