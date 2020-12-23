package 图形用户界面;

import java.awt.Button;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

public abstract class textbutton implements WindowListener{
	static Frame f=new Frame("javaGUI演示程序");
	//三个文本标签
	static Label lba=new Label("欢迎来到Java GUI程序");
	static Label lbb=new Label("当前发生的按钮事件");
	static Label lbc=new Label("按钮事件描述");
	
	//两个按钮
	
	static Button b1=new Button("会说话的按钮");
	static Button b2=new Button("退出");
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

