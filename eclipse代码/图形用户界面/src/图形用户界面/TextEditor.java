package 图形用户界面;

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
public class TextEditor extends Frame implements ActionListener{	//成员属性
	MenuBar mainmenubar;
	Menu file ;	
	MenuItem nw;	
	MenuItem op;	
	MenuItem cl;
	MenuItem sf;	
	MenuItem ex;	
	//成员属性2  编辑文本区域属性	TextArea tx;
	
	TextArea tx;
	//构造方法	
	public TextEditor(String title){	
		super(title);		
		setSize(400, 400);	
		//使窗体在屏幕上居中位置	
		tx=new TextArea();
		this.add(tx);
		setLocationRelativeTo(null);
		menuinit();	
		setVisible(true);	
	}	
	//菜单构建与处理
	void menuinit(){	
		mainmenubar = new MenuBar();	
		file = new Menu("文件");		
		nw = new MenuItem("新建文件");	
		op = new MenuItem("打开文件");	
		cl = new MenuItem("关闭文件");	
		sf = new MenuItem("保存文件");	
		ex = new MenuItem("退    出");	
		file.add(nw);	
		file.add(op);
		file.add(cl);
		file.add(sf);	
		file.add(ex);	
		mainmenubar.add(file);	
		setMenuBar(mainmenubar);
		
		//为每个菜单命令增加事件监听器；
		nw.addActionListener(this);
		op.addActionListener(this);
		cl.addActionListener(this);
		sf.addActionListener(this);
		ex.addActionListener(this);
		
	}									
	public static void main(String[] args) {	
		// TODO Auto-generated method stub	
		new TextEditor("简易文本编辑器");
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


