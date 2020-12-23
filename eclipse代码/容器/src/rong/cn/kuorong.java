
package rong.cn;


public class kuorong{
	
	private Object[] elementDate=new  Object[10] ;
	private int size;
	
	public void add(Object obj) {
		
		 //Ê²Ã´Ê±ºòÀ©ÈÝ
		if(size==elementDate.length) {
			
	        //À©ÈÝ²Ù×÷
			
			Object[] newArray=new Object[elementDate.length+(elementDate.length>>1)];
			
			System.arraycopy(elementDate,0,newArray,0,elementDate.length);
			
		    elementDate=newArray;
		    
		}

		elementDate[size++]=obj;
	}
	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		
		sb.append("[");
		for(int i=0;i<size;i++) {
			sb.append(elementDate[i]+",");
		}
		sb.setCharAt(sb.length()-1, ']');
		return sb.toString();
		
	}
	public static void main(String[] args) throws Exception{
		kuorong k=new kuorong();
		for(int i=0;i<40;i++) {
			k.add("aa");
			k.add("bb");
			k.add("cc");
		}
		
		System.out.println(k);
	}
}
