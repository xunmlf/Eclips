package cn.java01;
/**
 * 
 * @author lenovo
 *
 */
import java.io.File;
public class textmkdir {
	public static void main(String[] args) throws Exception {
		
		//1:����mkdir
        File f = new File("d:/c.txt");
        f.createNewFile(); // ����d����������c.txt�ļ�
        f.delete(); // �����ļ���Ŀ¼��Ӳ����ɾ��
        File f2 = new File("d:/��Ӱ/����/��½");
        boolean flag = f2.mkdir(); //Ŀ¼�ṹ����һ�������ڣ��򲻻ᴴ������Ŀ¼��
        System.out.println(flag);//����ʧ��
        
        //2:����mkdirs
        File f3 = new File("d:/c.txt");
        f3.createNewFile(); // ����d����������c.txt�ļ�
        f3.delete(); // �����ļ���Ŀ¼��Ӳ����ɾ��
        File f4 = new File("d:/��Ӱ/����/��½");
        boolean flag2= f4.mkdirs();//Ŀ¼�ṹ����һ��������Ҳû��ϵ����������Ŀ¼��
        System.out.println(flag2);//�����ɹ�
    }

}
