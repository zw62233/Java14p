public class sayHello{
	public static void main(String[]args){
		/*System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		*/
		if(args.length < 2){
			System.out.println("请输入2个数字");
		    return;
		}
		int i =Integer.parseInt(args[0]);
		int j =Integer.parseInt(args[1]);
		int result = i + j;
		System.out.println(""+i+" + "+j+" 相加的结果是 "+result);
	}
}