public class OverloadDemo{
	public static int add(int x, int y) { 
	 return x + y; 
	 } 
	public static double add(double x, double y) { 
		return x + y;  
	} 
	public static double add(double x, double y, double z) {
	 return x + y + z;
	 }
	public static void main(String[]args){
		/*
		方法的名字都叫 add. 但是有的 add 是计算 int 相加, 
		有的是 double 相加; 有的计算两个数字相加, 有的是计算三个数字相加. 同一个方法名字, 
		提供不同版本的实现, 称为 方法重载
		*/
	}
}