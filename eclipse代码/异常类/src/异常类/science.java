package 异常类;



public class science {
	public static void main(String[] args){
		try {
			String s1="123";
			String s2="456";
			int s,a1,a2;
			a1=Integer.parseInt(s1);
			a2=Integer.parseInt(s2);
			s=a1+a2;
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("无法转换成整数");
			System.out.println(e.getMessage());
			
		}
		
	}

}
