package cn.intent;
/**
 * ���������
 * @author lenovo
 *
 */
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
 
/**
 * ��򵥵ķ������˴���
 * @author Administrator
 */
public class tcp {
    public static void main(String[] args) {
        Socket socket = null;
        BufferedWriter bw = null;
        try {
            // �������������׽��֣�ָ�������Ľӿ�
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println("����˽�������");
            // �������ȴ��ͻ������󣬲�Ը���������
            socket = serverSocket.accept();
            // ��ȡsocket�����������ʹ�û��������а�װ
            bw = new BufferedWriter(new     
                                    OutputStreamWriter(socket.getOutputStream()));
            // ��ͻ��˷��ͷ�����Ϣ
            bw.write("hhhh");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // �ر�����socket����
            if (bw != null) {
                try {
                    bw.close();
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