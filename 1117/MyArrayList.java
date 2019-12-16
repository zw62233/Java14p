import java.util.Arrays;

public class MyArrayList{
	
	private int[] array;
	private int size;
	
	public MyArrayList(int num){
		int[] array = new int[num];
		size = 0;
	
	}

	public MyArrayList(){
		int[] array = new int[10];
		size = 0 ;
	}	
	public int get(int index){
		if(index < 0 || index >= size){
			throw new ArrayIndexOutOfBoundsException(index);
		}
		return array[index];
	}
	public int set(int index, int element){
		if(index < 0 || index >= size){
			throw new ArrayIndexOutOfBoundsException(index);
		}
		int old = array[index];
		array[index] = element;
		return old;
	}
	//true:足够 false:不够用
	private boolean checkCapacity(int num){
		return size + num <= array.length; 
	}
	private void ensureCapacity(){
		/*
		int newLength = array.length*2;
		int[] newArray = new int[newLength];
		for(int i = 0;i <size ;i++){
			newArray[i] = array[i];
		}
		this.array = newArray; //(可写为 array = newArray;)
		*/
		array = Arrays.copyOf(array,array.length*2);
	}
	public void insert(int index,int element){
        if(index < 0 || index > size){
			throw new ArrayIndexOutOfBoundsException(index);
		}
		boolean r = checkCapacity(1);
		
		if(!r){
			ensureCapacity();
		}
			for(int i = size;i > index;i--){
				array[i] = array[i - 1];
			}
			array[index] = element;
			size++;
	}
	public void delete(int index){
		if(size == 0){
			throw new ArrayIndexOutOfBoundsException(index);
		}
		for(int i = index;i <= size;i++){
			array[i] = array[i + 1];
		}
		array[--size] = 0;
	}
	public void pushBack(int element){
		insert(size,element);
	}
	public void pushFront(int element){
		this.insert(0,element);
	}
	public void popBack(){
		this.delete(size-1);
	}
	public void popFront(){
		this.delete(0);
	}
	
	@Override
	public String toString(){
		return Arrays.toString(Arrays.copyOf(array,size));
	}
	
	public static void main(String[] args){
		MyArrayList list = new MyArrayList(2);
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		System.out.println(list);
		list.insert(2,5);
		System.out.println(list);
	}
}