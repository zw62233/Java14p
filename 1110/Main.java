class Person{
	//属性
	String name;
	int age;
	String sex;
	int weight;
	//方法 （普通方法）
	void sayHello(String target){
		System.out.println(name + " say Hi~ o(*￣▽￣*)ブ to "+ target);
	}
}
public class Main{
	public static void main(String[] args){
		Person p = new Person();
		p.name = "张三";
        p.age = 16 ;
    	p.sayHello("太阳");	
	}
}