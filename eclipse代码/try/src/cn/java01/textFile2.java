package cn.java01;

import java.io.File;
import java.io.IOException;
/**
 * File���ۺ�Ӧ�ã�
 * @author lenovo
 *
 */
public class textFile2 {
    public static void main(String[] args) {
        //ָ��һ���ļ�
        File file = new File("d:/sxt/b.txt");
        //�жϸ��ļ��Ƿ����
        boolean flag= file.exists();
        //������ھ�ɾ������������ھʹ���
        if(flag){
            //ɾ��
            boolean flagd = file.delete();
            if(flagd){
                System.out.println("ɾ���ɹ�");
            }else{
                System.out.println("ɾ��ʧ��");
            }
        }else{
            //����
            boolean flagn = true;
            try {
                //���Ŀ¼�����ڣ��ȴ���Ŀ¼
                File dir = file.getParentFile();
                dir.mkdirs();
                //�����ļ�
                flagn = file.createNewFile();
                System.out.println("�����ɹ�");
            } catch (IOException e) {
                System.out.println("����ʧ��");
                e.printStackTrace();
            }          
        }
        //�ļ�������(ͬѧ�����Լ�����һ��)
        //file.renameTo(new File("d:/readme.txt"));
    }
}