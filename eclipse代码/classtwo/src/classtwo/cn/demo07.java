package classtwo.cn;
/**
 * �ݹ�ͷ���ݹ���
 * �׳˵ݹ�
 * @author lenovo
 *
 */
public class demo07 {
	public static void main(String[] args) {
		//demo07 d=new demo07();
		System.out.println(jc(5));
		//demo07.jc(5);
	}
	static long jc(int n){
		if(n==1) {
			return 1;
		}else {
			return n*jc(n-1);
			
		}
	}

}
