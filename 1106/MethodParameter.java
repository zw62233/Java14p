import java.util.Arrays;
import java.util.Scanner;

public class MethodParameter{
	public static void swap(int[] a,int i,int j){
		//形参交换，实参不变
		//形参改变是不会影响实参的，无论参数是基本数据类型还是引用数据类型
		//只有发生解引用时---修改了引用指向的对象的值时，才会出现变化可见的情况
		
		//引用往往指向一个对象
		//引用是可以不指向任何一个对象,如下
		//引用类型特殊字面量： null
		//int[] a = null;
		int[] t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	//原地排序--冒泡排序--排成从小到大
	public static void bubbleSort1(int[] a){
		//需要冒泡多少次的过程
		for(int i = 0;i<a.length-1;i++){
			//实心箭头的循环范围
			//[0，长度-i-1）
			for(int j =0;j<a.length-i-1;j++){
				//要比较的是j和j+1
				//保证后面数大（交换）
				if(a[j]>a[j+1]){
					swap(a,j,j+1);
				}
			}
		}
	}
	public static void bubbleSort2(int[] a){
		for(int i =0;i<a.length-1;i++){
			for(int j =0;j<a.length-i-1;j++){
				if
			}
		}
	}
	//二分查找--前提：数组有序，找不到返回-1
	public static int binarySearch(int[] a,int value){
		//查找范围[left,right)
		int left = 0;
		int right = a.length;
		//只要[left，right）有值就继续查找
		while(left < right){
			int mid = (left+right)/2;
			if(value == a[mid]){
				return mid;
			}else if(value < a[mid]){
				right==mid;
			}else{
				left=mid+1;
			}
		}
		return -1;
	}
	//进行数组复制，返回一个新数组，长度为newLength
	//长度超过补0
	public static int[] copyOf(int[] a,int newLength){
		int[] b = new int[newLength];
		int length = Math.min(newLength,a.length);
		for(int i = 0;i<length;i++){
			b[i] = a[i];
		}
		return b;
	}
	//数组复制
	public static int[] copyOfRange(int[] a,int from, int to){
		int[] dest = new int[to-from];
		for(int i = from ;i < to;i++){
			dest[i-from] = a[i];
		}
	}
	//数组填充
	public static void fill(int[] a,int val){
		for(int i = 0; i < a.length;i++){
			a[i] = val;
		}
	}
	//数组定点填充
	public static void fill(int[] a,int from, int to,int val){
		for(int i = from ;i < to ;i++){
			a[i]=val;
		}
	}
	//判断数组是否相同
	public static void equals(int[] a,int[] b){
		if(a.length != b.length){
			return false;
		}
		for(int i = 0;i<a.length;i++){
			if(a[i] != b[i]){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		int[] ar1 = {1,2,3,4};
		int[] ar2 = {9,7,3,2};
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
		bubbleSort1(ar1);
		bubbleSort1(ar2);
		System.out.println(Arrays.toString(copyOf(ar1,2)));
		System.out.println(Arrays.toString(copyOf(ar1,3)));
		Scanner scanner =new Scanner(System.in);
		int[] aFromScanner = new int[5];
		for(int i =0;i<5;i++){
			aFromScanner[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(copyOf(aFromScanner,3)));
	}
}