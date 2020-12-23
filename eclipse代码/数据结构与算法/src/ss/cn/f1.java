package ss.cn;

class first {
	void t(int n) {
		int i=1;
		while(i<=n) {
			System.out.println("i love you"+i);
			i++;
		}
	}
}
public class f1 {
	public static void main(String[] args) {
		first ff=new first();
		ff.t(10);
	}

}
