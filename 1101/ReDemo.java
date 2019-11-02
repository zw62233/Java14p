public class ReDemo{
	public static int nfac(int n){
		//	求n的阶乘  factorial
		int sum=0;
		if(n==1){
			return 1;
		}else{
			return nfac(n-1)*n;
		}
	}
	public static long fib(int n){
		//求第n项的斐波那契数
		//1 1 2 3 5 8 13
		//0 1 2 3 4
		//由第0项开始
		int sum=0;
		if(n==1||n==0){
			return 1;
		}else {
			return fib(n-1)+fib(n-2);
		}
	}
	public static void main(String[]args){
		    //打印第四项斐波那契数（由零开始）
			System.out.println(fib(4));
			//打印4的阶乘
			System.out.println(nfac(4));
	}
}