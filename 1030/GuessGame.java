import java.util.Random;
import java.util.Scanner;

public class GuessGame {
	public static void main(String[] args) {
		/*
		Random random = new Random(20191030);
		for (int i = 0; i < 20; i++) {
			int r = random.nextInt(10);
			System.out.println(r);
		}
		*/
		
		/**
			随机生成一个数 n:	[0, 100)
			用户有 4 次猜的机会
			如果用户的输入比 n 大: 告诉用户大了
			如果用户的输入比 n 小: 告诉用户小了
			否则: 成功退出
		*/
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.println("欢迎进入猜数字的游戏");
		System.out.println("请稍后，生成数字中...");
		int n = random.nextInt(100);
		System.out.println("数字已生成");
		int times = 4;
		System.out.println("您有 " + times + " 次机会");
		for (int i = 1; i <= times; i++) {
			System.out.print("> ");
			int x = scanner.nextInt();
			if (x == n) {
				System.out.println("猜测成功，用了 " + i + " 次机会");
				return;
			} else if (x < n) {
				System.out.println("第 " + i + " 次猜测，您猜的数字小了");
			} else {
				System.out.println("第 " + i + " 次猜测，您猜的数字大了");
			}
		}
		System.out.println("很遗憾，Game Over");
		System.out.println("数字其实是 " + n);
	}
}