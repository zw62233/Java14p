public class bikeDemo{
	public static void main(String[] args){
		bike bike = new bike();
		System.out.println("刚初始化");
		System.out.println(bike.getColor());
		bike.setColor("花里胡哨红");
		System.out.println("喷完漆后：");
		System.out.println(bike.getColor());
		
		System.out.println("下坡");
		for(int i = 1;i <= 10;i++){
			bike.speedUp();
			System.out.println(bike.getRate());
		}
	    System.out.println("上坡：");
		for(int i = 1;i <= 10;i++){
			bike.speedDown();
			System.out.println(bike.getRate());
		}
		
	}
}