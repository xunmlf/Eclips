package 图形用户界面;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;

public class caluater {
	public static void main(String[] args) {
		
		Frame f=new Frame("计算器");
		TextField tf=new TextField();
		
		//创建一个网格
		GridLayout gl=new GridLayout(2,3);
		f.setLayout(gl);
		Button b1=new Button("1");
		Button b2=new Button("2");
		Button b3=new Button("3");
		Button b4=new Button("4");
		Button b5=new Button("5");
		Button b6=new Button("6");
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		
		f.setSize(300,300);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}

}
