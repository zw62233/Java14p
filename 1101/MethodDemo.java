public class MethodDemo{
	//只有这里可以定义方法
	
	//求两个数的和
	//1.需要两个参数
	//2.参数类型：int
	//3.返回值类型：int
	//4.方法名称：add
	public static int add(int a,int b){
		int r=a+b;
		return r;
	}
	//计算两个double类型的减法，并打印返回值
	//1俩个参数double
	//2返回值 double
	//3方法名称 sub
	public static double sub(double x,double y){
		double s=x-y;
		return s;
	}
	//交换两变量的值*******错误示例
	/*public static void  swap(int a,int b){
		//无返回值，栈帧消亡，方法无用
		int t=a;
		a=b;
		b=t;
		*/
		//********************8
	}
	//求1！+2！+3！+4！+5！
	//分为求1-n阶乘方法和求多个数和的方法
	//求1~n阶乘方法
	public static int fac(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			sum*=i;
		}
		return sum;
	}
	//求多个数和的方法
	public static int addp(int n){
		if(n<=1){
			return -1;
		}
		for(int i =0;i<n;i++){
			n+=fac(i);
		}
		return n;
	}
	public static void main(String[]args){
		int a=1;
		int b=6;
		/*int r=add(a,b);
		double s=sub(a,b);
		System.out.println(r);
		System.out.println(s);
		*/
		//addp(5);
		//System.out.println(addp(5));
		//*******让用户输入********
		//1.args
		//System.out.println(addp(Intger.parseInt(args[0])));
		//2.scanner
		System.out.println(b);
	}
}