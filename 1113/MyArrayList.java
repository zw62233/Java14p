import java.util.Arrays;

public class MyArrayList{
	//属性
	private int[] array;
	private int size;
	//构造方法
	public MyArrayList(){
		array = new int[10];
        size = 0;		
	}
	//方法
	//增/删/查/改
	
	//尾增
	public void pushBack(int element){
		array[size++] = element;
	}
	//尾删
	public void popBack(){
		array[--size] = 0;
	}
	//头增
	public void pushFront(int element){
		//把原有元素后移一格
		//i 代表实心
		for(int i = size - 1;i >= 0; i--){
			array[i + 1] = array[i];
		}
		//把第一个元素添加
		array[0] = element;
		size++;
	}
	//头删
	public void popFront(){
		//把原有元素前移一格
		//i 实心
		for(int i = 1 ; i <= size - 1;i++){
			array[i - 1] = array[i];
		}
		array[--size] = 0;
		
	}
	//插入（根据下标
	public void insert(int element,int index){
		for(int i = size - 1;i >= index; i--){
			array[i + 1] = array[i];
		}
		array[index] = element;
		size++;
	}
	//删除（根据下标）
	public void delete(int index){
		for(int i = index;i <= size - 1; i++){
			array[i] = array[i+1];
		}
		array[size--] = 0;
	}
	
	@Override
	public String toString(){
		return Arrays.toString(Arrays.copyOf(array,size));
	}
	
	
	public static void main(String[] args){
		MyArrayList list = new MyArrayList();
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		System.out.println(list);// 1 2 3
		list.pushFront(25);
		list.pushFront(22);
		list.pushFront(21);
		System.out.println(list); // 21 22 25 1 2 3
		list.popBack();
		list.popBack();
		System.out.println(list); // 21 22 25 1
		list.popFront();
		System.out.println(list);  // 22 25 1
		list.insert(1000,1);
		System.out.println(list);  // 22 1000 25 1
		list.delete(1);
		System.out.println(list);  // 22 25 1
	}
}