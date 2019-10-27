public class Calc{
	public static void main(String []args){
				if(args.length < 2){
			System.out.println("请输入2个数字");
		    return;
		}
		int sum =0;
		for(int i =0;i<args.length;i++){
			sum+=Integer.parseInt(args[i]);
		}
		double average=sum/args.length;
		System.out.println("Average ="+average);
	}
}