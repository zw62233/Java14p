import java.util.Random;
import java.util.Scanner;
public class GuessGame{
	public static int selectDifficult(){
		System.out.println("1.菜鸡（0-50【8次机会】）");
		System.out.println("2.人类（0-500【8次机会】）");
		System.out.println("3.地狱（0-50000【15次机会】）");
		Scanner scanner=new Scanner(System.in);
		int difficult=scanner.nextInt();
		scanner.nextLine();
		return difficult;
	}
	public static int generateRandom(int difficult){
		Random random=new Random();
		switch(difficult){
			case 1:return random.nextInt(50);
			case 2:return random.nextInt(500);
			case 3:return random.nextInt(50000);
		}
		return -1;
	}
	public static int generateTimes(int difficult){
		Random random =new Random();
		//returen 的值由测试来看，要比输入的机会多1，并不相等
		//原因不明11.02留
		switch(difficult){
			case 1:return 9;
			case 2:return 9;
			case 3:return 16;
		}
		return -1;
	}
	public static boolean guess(int r){
		System.out.println("请输入数字:");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.nextLine();
		if(n==r){
			return true;
		}else if(n<r){
			System.out.println("猜小了");
		}else{
			System.out.println("猜大了");
		}
		return false;
		
	}
	public static void main(String[]args){
		System.out.println("=============================");
		System.out.println("==========猜数字=============");
		System.out.println("=============================");
		System.out.println("请选择游戏难度：");
		//1难度选择
		int difficult =selectDifficult();
		//2生成随机数
		int r=generateRandom(difficult);
		int times=generateTimes(difficult);
		//3循环x次机会
		boolean success=false;
		for(int i =1;i<times;i++){
			//4读取用户输入并且给出合适的提示
			success=guess(r);
			if(success){
				break;
			}else{
				int t=times-i-1;
			    System.out.println("还有"+t+"次机会");
		    }
		}
		
		//5根据用户猜测结果，给出游戏最终结果
		if(success){
			System.out.println("你真聪明");
		}else{
			System.out.println("人类一败涂地");
			System.out.println("其实数字是："+r);
		}
	}
}