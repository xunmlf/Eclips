package cn.java01;
/**
 * 测试Random类
 * @author lenovo
 *
 */
import java.util.Random;
public class textRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        
        //1：随机生成[0,1)之间的double类型的数据
        System.out.println(rand.nextDouble());
        
        //2：随机生成int类型允许范围之内的整型数据
        System.out.println(rand.nextInt());
        
        //3：随机生成[0,1)之间的float类型的数据
        System.out.println(rand.nextFloat());
        
        //4：随机生成false或者true
        System.out.println(rand.nextBoolean());
        
        //5：随机生成[0,10)之间的int类型的数据
        System.out.println(rand.nextInt(10));
        
        //6：随机生成[20,30)之间的int类型的数据
        System.out.println(20 + rand.nextInt(10));
        
        //7：随机生成[20,30)之间的int类型的数据（此种方法计算较为复杂）
        System.out.println(20 + (int) (rand.nextDouble() * 10));
    }
}
