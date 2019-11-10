public class RectionDemo{
	//按序列求每一位数字
	public static void printNumber(int n){
		if(n<10){
			System.out.print(n+" ");
		}else{
			//取高位
			int m=n/10;
			printNumber(m);//递归
			//取低位
			int o=n%10;
			System.out.print(o+" ");
		}
	}
	public static int sum(int n){
		//返回所有数字的和
		if(n<10){
			return n;
		}else{
			//高位
			int i=n/10;
			int h=sum(i);//递归
			//低位
			int o=n%10;
			//求和
			int s=o+h;
			return s;
		}
	}
	public static void hanoi(int n,int from,int to){
		//汉诺塔游戏模型
		//盘子数 柱子编号1 柱子编号2
		//柱子：  0  1  2
		if(n==1){
			System.out.printf("从 %d 移动到 %d%n",from,to);
		}else{
			int other=3-from-to;
			hanoi(n-1,from,other);
			System.out.printf("从 %d 移动到 %d%n",from,to);
			hanoi(n-1,other,to);
		}
	}
	
	public static void main(String[]args){
		printNumber(9527);
		System.out.println(sum(9527));
		hanoi(4,0,2);
	}
}