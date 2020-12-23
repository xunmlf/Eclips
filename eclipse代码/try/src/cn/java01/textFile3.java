package cn.java01;

import java.io.File;


public class textFile3 {
    public static void main(String[] args) {
        File f = new File("d:/��Ӱ");
        printFile(f, 0);
    }
    /**
     * ��ӡ�ļ���Ϣ
     * @param file �ļ�����
     * @param level �����(ʵ�ʾ��ǣ��ڼ��εݹ����)
     */
    static void printFile(File file, int level) {
        //��������
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        //����ļ���
        System.out.println(file.getName());
        //���file��Ŀ¼�����ȡ���ļ��б�����ÿ�����ļ�������ͬ�Ĳ���
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File temp : files) {
                //�ݹ���ø÷�����ע���+1
                printFile(temp, level + 1);
            }
        }
    }
}