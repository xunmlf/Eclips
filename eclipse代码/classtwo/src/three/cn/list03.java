package three.cn;

/**
 * 增加数组的遍历
 * @author lenovo
 *
 */

public class list03 {
	private Object a[]=new Object[10];
	private int size;
	
	//从写add方法
	public void add(Object obj) {
		
		if(size==a.length) {
			
			Object newa[]=new Object[a.length+(a.length>>1)];
			
			System.arraycopy(a, 0, newa, 0, a.length);
			
			a=newa;
		}
		a[size++]=obj;
	}
	
	//重写tostring方法
	public  String toString() {
		
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<size;i++) {
			sb.append(a[i]+".");
		}
		//最后一个用；替换
		sb.setCharAt(sb.length()-1,';');
		return sb.toString();
		
	}
	public static void main(String[] args) {
		list03 ll=new list03();
		for(int i=0;i<20;i++) {
			ll.add(i);
		}
		System.out.println(ll);
		
	}

}
