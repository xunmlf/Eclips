package cn.java01;
/**
 * ����Random��
 * @author lenovo
 *
 */
import java.util.Random;
public class textRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        
        //1���������[0,1)֮���double���͵�����
        System.out.println(rand.nextDouble());
        
        //2���������int��������Χ֮�ڵ���������
        System.out.println(rand.nextInt());
        
        //3���������[0,1)֮���float���͵�����
        System.out.println(rand.nextFloat());
        
        //4���������false����true
        System.out.println(rand.nextBoolean());
        
        //5���������[0,10)֮���int���͵�����
        System.out.println(rand.nextInt(10));
        
        //6���������[20,30)֮���int���͵�����
        System.out.println(20 + rand.nextInt(10));
        
        //7���������[20,30)֮���int���͵����ݣ����ַ��������Ϊ���ӣ�
        System.out.println(20 + (int) (rand.nextDouble() * 10));
    }
}
