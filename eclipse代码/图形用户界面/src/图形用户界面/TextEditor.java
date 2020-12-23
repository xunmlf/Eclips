package ͼ���û�����;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFileChooser;

class CloseHandler extends WindowAdapter{
	public void WindowClosing(WindowEvent e) {
		System.exit(0);
	}
}
public class TextEditor extends Frame implements ActionListener{	//��Ա����
	MenuBar mainmenubar;
	Menu file ;	
	MenuItem nw;	
	MenuItem op;	
	MenuItem cl;
	MenuItem sf;	
	MenuItem ex;	
	//��Ա����2  �༭�ı���������	TextArea tx;
	
	TextArea tx;
	//���췽��	
	public TextEditor(String title){	
		super(title);		
		setSize(400, 400);	
		//ʹ��������Ļ�Ͼ���λ��	
		tx=new TextArea();
		this.add(tx);
		setLocationRelativeTo(null);
		menuinit();	
		setVisible(true);	
	}	
	//�˵������봦��
	void menuinit(){	
		mainmenubar = new MenuBar();	
		file = new Menu("�ļ�");		
		nw = new MenuItem("�½��ļ�");	
		op = new MenuItem("���ļ�");	
		cl = new MenuItem("�ر��ļ�");	
		sf = new MenuItem("�����ļ�");	
		ex = new MenuItem("��    ��");	
		file.add(nw);	
		file.add(op);
		file.add(cl);
		file.add(sf);	
		file.add(ex);	
		mainmenubar.add(file);	
		setMenuBar(mainmenubar);
		
		//Ϊÿ���˵����������¼���������
		nw.addActionListener(this);
		op.addActionListener(this);
		cl.addActionListener(this);
		sf.addActionListener(this);
		ex.addActionListener(this);
		
	}									
	public static void main(String[] args) {	
		// TODO Auto-generated method stub	
		new TextEditor("�����ı��༭��");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		
		Object ob=e.getSource();
		JFileChooser f=new JFileChooser();
		if(ob==nw||ob==cl) {
			tx.setText("");
			
		}else if(ob==op){
			f.showOpenDialog(this);
			
			try {
				StringBuffer s=new StringBuffer();
				FileReader in=new FileReader(f.getSelectedFile());
				while(true) {
					int b=in.read();
					if(b!=-1) {
						break;
					}else{
						s.append((char)b);
					}
					tx.setText(s.toString());
					in.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}finally {
				
			}
			
		}else if(ob==sf) {
			f.showSaveDialog(this);
			try {
				FileWriter out =new FileWriter(f.getSelectedFile());
				out.write(tx.getText());
				out.flush();
				out.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}else if(ob==ex) {
			System.exit(0);
		}
	}
}


