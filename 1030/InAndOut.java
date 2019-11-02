import java.util.Scanner;

public class InAndOut {
	public static void main(String[] args) {
		//System.err.println("我是打印在标准错误上的");
		//System.out.println(System.in.read());
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入您的姓名:");
		String name = scanner.nextLine();
		System.out.println("请输入您的年龄:");
		int age = scanner.nextInt();
		scanner.nextLine();	// 读走遗留的 \n
		System.out.println("请输入您的性别:");
		String gender = scanner.nextLine();
		
		System.out.println("登记成功!!!");
		System.out.println("姓名: " + name);
		System.out.println("年龄: " + age);
		System.out.println("性别: " + gender);
		/*
		while (scanner.hasNext()) {
			//String s = scanner.next();	// ' '/'\n'/'\t'
			String s = scanner.nextLine();	// '\n'
			System.out.println(s);	
		}
		*/
	}
}