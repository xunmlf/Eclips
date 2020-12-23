package three.cn;
/**
 * 数组的遍历
 * @author lenovo
 *
 */
public class list04 {
	private Object[] b=new Object[10];
	int size ;
	
	public void add(Object obj) {
		
		if(size==b.length) {
			
			Object[] newArr=new Object[b.length+(b.length>>1)];
			
			System.arraycopy(b, 0, newArr, 0, b.length);
			
			b=newArr;
			
		}
		b[size]=obj;
		size++;
	}
	public String toString() {
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<size;i++) {
			sb.append(b[i]+".");
		}
		sb.setCharAt(sb.length()-1,' ');
		return sb.toString();
	}
	public static void main(String[] args) {
		list04 ls=new list04();
		for(int i=0;i<20;i++) {
			ls.add(i);
		}
		System.out.println(ls);
		
	}

}
