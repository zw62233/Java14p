public class Book{
	//属性
	private String nameOfBook;
	private String writer;
	private double price;
	private String press;
	//构造方法
	Book(String nameOfBook,String writer,double price,String press){
		this.nameOfBook = nameOfBook;
		this.writer = writer;
		this.price = price;
		this.press = press;
	}
	//方法
	//getter
	String getnameOfBook(){
		return nameOfBook;
	}
	String getwriter(){
		return writer;
	}
	double getprice(){
		return price;
	}
	String getpress(){
		return press;
	}
	void appendWriter(String writer){
		this.writer = this.writer +" "+ writer;//添加作者
	}
	double getDiscount(double discount){
		return discount*price;//打折
	}
	//覆写
	@Override
	public String toString(){
		return System.format("《%s》by %s",nameOfBook,writer);
	}
}
