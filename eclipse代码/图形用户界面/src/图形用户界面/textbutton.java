package ͼ���û�����;

import java.awt.Button;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

public abstract class textbutton implements WindowListener{
	static Frame f=new Frame("javaGUI��ʾ����");
	//�����ı���ǩ
	static Label lba=new Label("��ӭ����Java GUI����");
	static Label lbb=new Label("��ǰ�����İ�ť�¼�");
	static Label lbc=new Label("��ť�¼�����");
	
	//������ť
	
	static Button b1=new Button("��˵���İ�ť");
	static Button b2=new Button("�˳�");
	public static void main(String[] args) {
		f.setSize(200,200);
		f.setLayout(new FlowLayout());
		f.add(lba);
		f.add(lbb);
		f.add(lbc);
		f.add(b1);
		f.add(b2);
	
		b1.addActionListener(new Handler2());
		b2.addActionListener(new Handler());
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		
		
		
	}
}
class Handler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
	
}
class Handler2 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

