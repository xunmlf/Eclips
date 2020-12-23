package cn.java01;

/**
 * 测试FILE类的基本用法
 */

import java.io.File;
import java.util.Date;
public class textFile {
    public static void main(String[] args) throws Exception {
    	
    	//1
        System.out.println(System.getProperty("user.dir"));
        File f1 = new File("a.txt"); //相对路径：默认放到user.dir目录下面
        f1.createNewFile();//创建文件
        File f2 = new File("d:/b.txt");//绝对路径
        f2.createNewFile();//新建
        
        //2
        File f = new File("d:/b.txt");
        System.out.println("File是否存在："+f.exists());
        System.out.println("File是否是目录："+f.isDirectory());
        System.out.println("File是否是文件："+f.isFile());
        System.out.println("File最后修改时间："+new Date(f.lastModified()));
        System.out.println("File的大小："+f.length());
        System.out.println("File的文件名："+f.getName());
        System.out.println("File的目录路径："+f.getPath());
        
    }
}