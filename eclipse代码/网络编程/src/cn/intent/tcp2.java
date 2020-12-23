package cn.intent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
/**
 * ��򵥵�Socket�ͻ���
 * @author Administrator
 */
public class tcp2 {
    public static void main(String[] args) {
        Socket socket = null;
        BufferedReader br = null;
        try {
            /*
             * ����Scoket����ָ��Ҫ���ӵķ�������IP�Ͷ˿ڶ������Լ�������
             * �˿ڡ����Ͷ˿�������ġ�
             */
            socket = new Socket(InetAddress.getLocalHost(), 8888);
            //��ȡscoket������������ʹ�û��������а�װ
            br = new BufferedReader(new  
                                   InputStreamReader(socket.getInputStream()));
            //���շ������˷��͵���Ϣ
            System.out.println(br.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // �ر�����socket����
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}