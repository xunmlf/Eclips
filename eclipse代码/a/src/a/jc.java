package a;

public class jc {
	public static void main(String[] args) {
		System.out.println(j(5));
	}
	static long j(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n*j(n-1);
		}
	}

}
