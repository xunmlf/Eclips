package cn.java01;

/**
 * ����FILE��Ļ����÷�
 */

import java.io.File;
import java.util.Date;
public class textFile {
    public static void main(String[] args) throws Exception {
    	
    	//1
        System.out.println(System.getProperty("user.dir"));
        File f1 = new File("a.txt"); //���·����Ĭ�Ϸŵ�user.dirĿ¼����
        f1.createNewFile();//�����ļ�
        File f2 = new File("d:/b.txt");//����·��
        f2.createNewFile();//�½�
        
        //2
        File f = new File("d:/b.txt");
        System.out.println("File�Ƿ���ڣ�"+f.exists());
        System.out.println("File�Ƿ���Ŀ¼��"+f.isDirectory());
        System.out.println("File�Ƿ����ļ���"+f.isFile());
        System.out.println("File����޸�ʱ�䣺"+new Date(f.lastModified()));
        System.out.println("File�Ĵ�С��"+f.length());
        System.out.println("File���ļ�����"+f.getName());
        System.out.println("File��Ŀ¼·����"+f.getPath());
        
    }
}