public class ArrayDemo{
	// 给一个值返回数组类型
	//public static int[] reArray(int n){
		// return int[]a;
	// }
	public static void printArray(int[]a){
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		//for-each:不同于c 的遍历数组
		for(int x:a){
			System.out.print(x);
		}
	}
	public static int reMax(int[]a){
		//给定数组求最大值
		/*
		法一
		int max=a[0]
		for(int i=1;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}
		}
		return max;
		*/
		//法二
		int max=Integer.MIN_VALUE;
		for(int v: a){
			if(v>max){
				max=v;
			}
		}
		return max;
	}
	public static double average(int[]a){
		//求数组元素的平均数
		//法一
		double aver=0;
		int sum=0;
		for(int i =0;i<a.length;i++){
			sum+=a[i];
		}
		aver=sum/a.length;
		return aver;
		/*
		法二
		double ave=0;
		int sum=0;
		for(v:a){
			sum+=v;
		}
		ave=sum/a.length;
		return ave;
		*/
		
	}
	public static int indexOf(int[]a,int n){
		//给定一个值，求该值在给定数组第一次出现的下标
		for(int i=0;i<a.length;i++){
			if(n==a[i]){
				return i;
			}
		}
		return -1;
	}
	public static int lastIndexOf(int[]a,int n){
		//给定一个值，求该值在给定数组最后一次出现的下标
		for(int i=a.length-1;i>=0;i--){
			if(n==a[i]){
				return i;
			}
		}
		return -1;
	}
public static int[] copyOfRange(int[]a,int from,int to){
	int[] b=new int[to-from];
	for(int i=from;i<to;i++){
		b[i-from]=a[i];
	}
	return b;
}
	public static void main(String[]args){
		int[] a=new int[]{1,2,3,5,5};
		System.out.println(indexOf(a,5));
		System.out.println(lastIndexOf(a,5));
		System.out.println(average(a));
		System.out.println(reMax(a));
		int[] c=copyOfRange(a,0,5);
		for(int v:c){
		System.out.println(v);
		}
	}
}