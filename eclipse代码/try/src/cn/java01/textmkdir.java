package cn.java01;
/**
 * 
 * @author lenovo
 *
 */
import java.io.File;
public class textmkdir {
	public static void main(String[] args) throws Exception {
		
		//1:测试mkdir
        File f = new File("d:/c.txt");
        f.createNewFile(); // 会在d盘下面生成c.txt文件
        f.delete(); // 将该文件或目录从硬盘上删除
        File f2 = new File("d:/电影/华语/大陆");
        boolean flag = f2.mkdir(); //目录结构中有一个不存在，则不会创建整个目录树
        System.out.println(flag);//创建失败
        
        //2:测试mkdirs
        File f3 = new File("d:/c.txt");
        f3.createNewFile(); // 会在d盘下面生成c.txt文件
        f3.delete(); // 将该文件或目录从硬盘上删除
        File f4 = new File("d:/电影/华语/大陆");
        boolean flag2= f4.mkdirs();//目录结构中有一个不存在也没关系；创建整个目录树
        System.out.println(flag2);//创建成功
    }

}
