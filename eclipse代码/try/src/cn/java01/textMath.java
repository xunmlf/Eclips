package cn.java01;
/**
 * ����Math��
 * @author lenovo
 *
 */
public class textMath {
	public static void main(String[] args) {
		
        //1��ȡ����ز���
        System.out.println(Math.ceil(3.2));
        System.out.println(Math.floor(3.8));
        System.out.println(Math.round(3.2));
        System.out.println(Math.round(3.8));
        
        //2������ֵ��������a��b���ݵȲ���
        System.out.println(Math.abs(-45));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.pow(5, 2));
        System.out.println(Math.pow(2, 5));
        
        //3��Math���г��õĳ���
        System.out.println(Math.PI);
        System.out.println(Math.E);
        
        //4�������
        System.out.println(Math.random());// [0,1)
    }

}
