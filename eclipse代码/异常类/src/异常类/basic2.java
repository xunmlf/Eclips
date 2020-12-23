package 异常类;

class ArithmeticException{
	public ArithmeticException() {
		
	}

	public int calculate(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}

public class basic2 {
	public static void main(String[] args) {
		ArithmeticException obj=new ArithmeticException();
		try {
			int result=obj.calculate(9,0);
			System.out.println(result);
		} catch(Exception e) {
			System.err.println("发生异常"+e.toString());
			e.printStackTrace();
		}
	
	}
}
