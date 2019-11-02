public class SwitchDemo {
	public static void main(String[] args) {
		/*
		String s = args[0];
		
		switch (s) {
			case "-encoding":
				System.out.println("用户指定了编码格式");
				break;
			case "Run":
				System.out.println("快跑");
				break;
			case "第一步":
				System.out.println("运行第一步");
			case "第二步":
				System.out.println("运行第二步");
				break;
			default:
				System.out.println("我不知道你在说什么");
		}
		*/
		
		// [0, 6]
		int today = Integer.parseInt(args[0]);
		// 星期几
		// 不认识的参数
		switch (today) {
			case 0:
				System.out.println("星期一");
				break;
			case 1:
				System.out.println("星期二");
				break;
			case 2:
				System.out.println("星期三");
				break;
			case 3:
				System.out.println("星期四");
				break;
			case 4:
				System.out.println("星期五");
				break;
			case 5:
				System.out.println("星期六");
				break;
			case 6:
				System.out.println("星期日");
				break;
			default:
				System.out.println("错误的输入");
		}
	}
}
			
			
			
			
			
			
			
			
			
			
			