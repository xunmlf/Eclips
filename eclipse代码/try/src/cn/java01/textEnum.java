package cn.java01;

import java.util.Random;

/**
 * ö��
 * @author lenovo
 *
 */
public class textEnum {
	public static void main(String[] args) {
        // ö�ٱ���
        for (Week k : Week.values()) {
            System.out.println(k);
        }
        // switch�����ʹ��ö��
        int a = new Random().nextInt(4); // ����0��1��2��3�������
        switch (Season.values()[a]) {
        case SPRING:
            System.out.println("����");
            break;
        case SUMMER:
            System.out.println("����");
            break;
        case AUTUMN:
            System.out.println("����");
            break;
        case WINDTER:
            System.out.println("����");
            break;
        }
    }
}
/**����*/
enum Season {
    SPRING, SUMMER, AUTUMN, WINDTER
}
/**����*/
enum Week {
    ����һ, ���ڶ�, ������, ������, ������, ������, ������
}

