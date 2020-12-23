package 图形用户界面;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class Login {
	//成员属性
	Frame app = new Frame("登录");
	Label lblName = new Label("username:");
	static TextField txtName = new TextField();
	Label lblPass = new Label("password:");
	static TextField txtPass = new TextField();
	//登录的构造方法
	public Login(){
		app.setSize(300, 150);
		app.setLayout(null);
		//为组建设置左上角顶点的坐标和组件的大小
		lblName.setBounds(60, 50, 70, 20);
		txtName.setBounds(135, 50, 100, 20);
		lblPass.setBounds(60, 90, 70, 20);
		txtPass.setBounds(135, 90, 100, 20);
		app.add(lblName);
		app.add(txtName);
		app.add(lblPass);
		app.add(txtPass);
		
		app.setLocation(200, 100);
		app.setVisible(true);
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Login();
	}

}
