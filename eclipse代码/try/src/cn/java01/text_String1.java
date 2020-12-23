package cn.java01;

/**
 * 测试String类的用法
 * @author 宁
 *
 */



public class text_String1 {
	public static void main(String[] args) {
		String s1="abcde";
		String s2="Abcde";
		
		//1 ：输出某个具体字符
		System.out.println(s2.charAt(1));//取该字符串中的下标为2的字符
		System.out.println("***************");
		
		//2：输出字符串的长度
		System.out.println(s2.length());//字符串的长度
		System.out.println("***************");
		
		//3：比较两个字符串
		System.out.println(s1.equals(s2));//比较两个字符串是否相等要考虑大小写
		System.out.println(s1.equalsIgnoreCase(s2));//比较字符串不考虑大小写
		System.out.println("***************");
	
		//4：判断某个字符是否存在于该字符串中       存在为0，不存在为-1；
		System.out.println(s1.indexOf("ab"));//字符串s1中是否包含ab
        System.out.println(s1.indexOf("apple"));//字符串s1中是否包含apple
        System.out.println("***************");
        
		//5：将某个字符进行替换
        String s = s1.replace('a', '&');//将s1中的空格替换成&
        System.out.println("result is :" + s);
		System.out.println();
		System.out.println("***************");
		
		//6:判断字符的开头和结尾
//		String s = "";
//        String s1 = "How are you?";
//        System.out.println(s1.startsWith("How"));//是否以How开头
//        System.out.println(s1.endsWith("you"));//是否以you结尾
        
        //7：提取字符
//        s = s1.substring(4);//提取子字符串：从下标为4的开始到字符串结尾为止
//        System.out.println(s);
//        s = s1.substring(4, 7);//提取子字符串：下标[4, 7) 不包括7
//        System.out.println(s);
//        
        //8：字符间大小写转换
        s = s1.toLowerCase();//转小写
        System.out.println(s);
        s = s1.toUpperCase();//转大写
        System.out.println(s);
        
        //9:
//        String s2 = "  How old are you!! ";
//        s = s2.trim();//去除字符串首尾的空格。注意：中间的空格不能去除
//        System.out.println(s);
//        System.out.println(s2);//因为String是不可变字符串，所以s2不变
        
        //10:去空格
        String a="    aaaaaaa   ";
        System.out.println(a);
        System.out.println(a.trim());
	}

}
