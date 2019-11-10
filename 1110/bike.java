class bike{
	//属性
	String color; //颜色
	int nRate;    //当前速度
	int mRate;    //最高速度
	//方法
	//setter
	public void setColor(String c){
		color = c; //改装色
	}
	public void speedUp(){
		nRate +=10;    //加速
		if(nRate > mRate){
			nRate = mRate;
		}
	}
	public void speedDown(){
		nRate -= 10;   //减速
		if(nRate  < 0){
		   nRate = 0; 
		}
	}
	//getter
	public String getColor(){
		return color;   //返回当前颜色
	}
	public int getRate(){
		return nRate;   //返回当前速度
	}
	//构造方法
	bike(){
		color = "五彩斑斓黑";
		nRate = 0;
		mRate = 128;
	}
	bike(String color){
		this.color = color;
	}
}