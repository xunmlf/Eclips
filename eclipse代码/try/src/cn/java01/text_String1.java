package cn.java01;

/**
 * ����String����÷�
 * @author ��
 *
 */



public class text_String1 {
	public static void main(String[] args) {
		String s1="abcde";
		String s2="Abcde";
		
		//1 �����ĳ�������ַ�
		System.out.println(s2.charAt(1));//ȡ���ַ����е��±�Ϊ2���ַ�
		System.out.println("***************");
		
		//2������ַ����ĳ���
		System.out.println(s2.length());//�ַ����ĳ���
		System.out.println("***************");
		
		//3���Ƚ������ַ���
		System.out.println(s1.equals(s2));//�Ƚ������ַ����Ƿ����Ҫ���Ǵ�Сд
		System.out.println(s1.equalsIgnoreCase(s2));//�Ƚ��ַ��������Ǵ�Сд
		System.out.println("***************");
	
		//4���ж�ĳ���ַ��Ƿ�����ڸ��ַ�����       ����Ϊ0��������Ϊ-1��
		System.out.println(s1.indexOf("ab"));//�ַ���s1���Ƿ����ab
        System.out.println(s1.indexOf("apple"));//�ַ���s1���Ƿ����apple
        System.out.println("***************");
        
		//5����ĳ���ַ������滻
        String s = s1.replace('a', '&');//��s1�еĿո��滻��&
        System.out.println("result is :" + s);
		System.out.println();
		System.out.println("***************");
		
		//6:�ж��ַ��Ŀ�ͷ�ͽ�β
//		String s = "";
//        String s1 = "How are you?";
//        System.out.println(s1.startsWith("How"));//�Ƿ���How��ͷ
//        System.out.println(s1.endsWith("you"));//�Ƿ���you��β
        
        //7����ȡ�ַ�
//        s = s1.substring(4);//��ȡ���ַ��������±�Ϊ4�Ŀ�ʼ���ַ�����βΪֹ
//        System.out.println(s);
//        s = s1.substring(4, 7);//��ȡ���ַ������±�[4, 7) ������7
//        System.out.println(s);
//        
        //8���ַ����Сдת��
        s = s1.toLowerCase();//תСд
        System.out.println(s);
        s = s1.toUpperCase();//ת��д
        System.out.println(s);
        
        //9:
//        String s2 = "  How old are you!! ";
//        s = s2.trim();//ȥ���ַ�����β�Ŀո�ע�⣺�м�Ŀո���ȥ��
//        System.out.println(s);
//        System.out.println(s2);//��ΪString�ǲ��ɱ��ַ���������s2����
        
        //10:ȥ�ո�
        String a="    aaaaaaa   ";
        System.out.println(a);
        System.out.println(a.trim());
	}

}
