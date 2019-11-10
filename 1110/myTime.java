public class myTime{
	//属性
	private int hour;
	private int minute;
	private int second;
	private boolean b24 = true;
	//构造方法
	myTime(int hour,int minute,int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		if(hour > 23||minute > 59||second > 59){
			System.out.println("输入有误");
			return;
		}
		if(hour < 0||minute < 0||second < 0){
			System.out.println("输入有误");
			return;
		}
	}
	//方法
	void add(int s){
		this.second += s;
        while(second >=60){
			second -= 60;
			minute += 1;
			if(minute >= 60){
				minute -= 60;
				hour += 1;
                if(hour ==24){
					hour =0;
				}				
			}
		}		
	}
	//覆写
	@Override
	public String toString(){
		if(b24){
		    return String.format("%d时%d分%d秒",hour,minute,second);
		}else{
			String amOrpm = "AM";
			if(hour >= 12){
				amOrpm = "PM";
			}
			int h = hour;
		    if(h==12){
				h -=12;
		   }
		   return String.format("%s "+"%d时%d分%d秒",amOrpm,hour,minute,second);
		}
	}
	public static void main(String[] args){
		myTime t = new myTime(23,56,32);
		System.out.println(t);
		t.add(10000);
		System.out.println(t);
	}
}