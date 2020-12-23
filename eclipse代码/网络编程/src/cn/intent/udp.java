package cn.intent;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.Buffer;

/*
 * test UDP 发送数据
 */
public class udp {
	public void sender() throws Exception{
		DatagramSocket socket = new DatagramSocket();
		String str ="我是小球";
		byte [] bytes =str.getBytes();
		DatagramPacket packet = new DatagramPacket(bytes,0,InetAddress.getLocalHost(),9090);
		socket.send(packet);
	}
	public void receiver() throws Exception {
		DatagramSocket socket = new DatagramSocket(9090);
		byte [] bytes = new byte[100];
		DatagramPacket packet = new DatagramPacket(bytes,0,bytes.length);
		socket.receive(packet);
		System.out.println(new String(packet.getData(),0,packet.getLength()));
	}
}

