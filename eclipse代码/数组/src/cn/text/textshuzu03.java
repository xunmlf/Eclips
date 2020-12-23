package cn.text;
/**
 * 对象数组
 * @author lenovo
 *
 */

class person{
	String name;
	int age;
	public person(String name,int age) {
		this.name=name;
		this.age=age;
	}
}
public class textshuzu03 {
	public static void main(String[] args) {
		person p[]=new person[3];
		p[0]=new person("lili",18);
		p[1]=new person("lilt",23);
		p[2]=new person("lili",18);
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i].name+"今年"+p[i].age+"少岁了");
		}
	}

}
