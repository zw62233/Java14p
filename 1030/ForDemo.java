public class ForDemo {
	public static void main(String[] args) {
		/*
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		// System.out.println(i);	作用域
		*/
		
		
		int[] a = { 1, 2, 3, 4, 5, 6 };
		// 找到数组中 n 所在的下标
		int n = 3;
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			
			System.out.println("检查之前");
			if (a[i] == n) {
				index = i;
				continue;
			}
			System.out.println("检查之后");
		}
		System.out.println(index);
	}
}