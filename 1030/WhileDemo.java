public class WhileDemo {
	public static void main(String[] args) {
		/*
		int n = 0;
		while (n < 10) {
			System.out.println(n);
			n++;
		}
		
		System.out.println(n);
		*/
		
		// 1! + 2! + 3! + 4! + 5!
		// 把大问题分解成小问题
		// 1. 写代码求阶乘
		// 2. 写代码分别输出 1，2，3，4，5 的阶乘
		// 3. 求出和
		
		int sum = 0;
		int n = 5;
		int i = 1;
		while (i <= n) {
			int factor = 1;
			int j = 1;
			while (j <= i) {
				factor *= j;
				j++;
			}
			sum += factor;
			i++;
		}
		
		System.out.println(sum);
	}
}








