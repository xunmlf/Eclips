package cn.text;
/**
 * ð������
 */
import java.util.Arrays;

public class ning_05 {
	public static void main(String[] args) {
		    int a[]= {50,7,66,9,1,10,45,100,12};
//	ʵ�����齻��		Arrays.sort(a);
		    System.out.println("����ǰ");
		    for(int m:a) {
		    	 System.out.print(m+",");
		    }
		    int i=0,j=0;
		    int t;
		    for(i=0;i<a.length-1;i++){
		    	for(j=0;j<a.length-i-1;j++) {
			    	if(a[j]>a[j+1]) {
			    		t=a[j];
			    		a[j]=a[j+1];
			    		a[j+1]=t;
			    	}
			    }
		    }
		    System.out.println();
		    System.out.println("�����");
			System.out.println(Arrays.toString(a));
		}
	

}
