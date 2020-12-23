package cn.java02;

import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
/**
 * QQ��ը��
 */
public class QQBoom {
	//����������
    static Desktop deskapp = Desktop.getDesktop();
 
    public static void main(String [] args) throws AWTException{
         inputQQ();
    }
    //��QQ
    public static void openQQ(){
        //�жϵ�ǰϵͳ�ͷ�֧��Desktop�ṩ�Ľӿ�
        if(Desktop.isDesktopSupported()){
            try {
            	//QQ��·��
                deskapp.open(new File("C:\\Program Files (x86)\\QQ\\Bin\\QQScLauncher.exe"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //�˺���������
    public static void InputAP() throws AWTException{
    	//�����Զ�����
        Robot robot = new Robot();
        //3�ȴ�3���ʼִ��������Զ������¼�
        robot.delay(3000);
        //���������(Ŀ�����ù��ŵ�QQ��)
        QQBoom.mouseLeftHit(robot); //��ý���
        QQBoom.keyPressNumber(robot,324); //�˺�
        QQBoom.keyPress(robot, KeyEvent.VK_TAB); //TAB����
        QQBoom.keyPressNumber(robot, 1111);  //����
        QQBoom.keyPress(robot, KeyEvent.VK_ENTER); //�س�
    }
    //QQ��Ϣ����
    public static void inputQQ() throws AWTException{
    	//�����Զ�����
        Robot robot = new Robot();
        //3�ȴ�3���ʼִ��������Զ������¼�
        robot.delay(3000);
        //���������(Ŀ�����ù��ŵ�QQ��)
        QQBoom.mouseLeftHit(robot);
        for(int i = 0 ; i < 10; i++){
            //��������
        	QQBoom.keyPressString(robot, "����С���з����Զ���������˵�"+i+"�η���");
            //���»س�
        	QQBoom.keyPress(robot, KeyEvent.VK_ENTER);
        }
    }
    //Ctrl��ϼ�
    public static void keyPressWithCtrl(Robot r,int key){
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(key);
 
        r.keyRelease(key);
        r.keyRelease(KeyEvent.VK_CONTROL);
 
        r.delay(100);
    }
    //�����ַ���
    public static void keyPressString(Robot r ,String str){
        //��ȡ���а�
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        //�������ַ�����װ��
        Transferable tText = new StringSelection(str);
        //���ַ���������а�
        clip.setContents(tText, null);
        //����Ctrl+Vʵ��ճ���ı�
        keyPressWithCtrl(r, KeyEvent.VK_V);
        r.delay(100);
    }
    //��������
    public static void keyPressNumber(Robot r ,int number){
        //������ת���ַ���
        String str = Integer.toString(number);
        //�����ַ����ķ���
        keyPressString(r,str);
    }
    //ʵ�ְ�һ��ĳ������
    public static void keyPress(Robot r,int key){
        //���¼�
        r.keyPress(key);
        //�ͷż�
        r.keyRelease(key);
 
        r.delay(1000);
    }
    //���һ��������
    public static void mouseLeftHit(Robot r){
        r.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
        r.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
        r.delay(1000);
    }
}
