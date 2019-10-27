public class MaxMin{
	public static void main(String[]args){
		int a=2;
		int b=6;
		int c=9;
		int max,min;
		if(a>b){
              max=a;
			  min=b;
		}else{
			 max=b;
			 min=a;
		}
		if(max>c){
				System.out.println("Max="+max);
		}else{
			max=c;
			System.out.println("Max="+max);
		}
		if(min<c){
			System.out.println("Min="+min);
		}else{
			min=c;
			System.out.println("Min="+min);
		}		
	}
}