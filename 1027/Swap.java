public class Swap{
	public static void main(String[]args){
		int a=1;
		int b=2;
		int tmp=0;
		System.out.println("交换前a="+a);
		System.out.println("b="+b);
		tmp=a;
		a=b;
		b=tmp;
		System.out.println("交换后a="+a);
		System.out.println("b="+b);
	}
}