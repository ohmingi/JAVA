package week5;

class Device_2 {
	private String name;
	private int year;
	
	Device_2(){}
	Device_2(String name,int year){
		this.name=name;
		this.year=year;
	}
	
	public String getInfor() {
		return name + " "+ year;
	}
}


class mp3 extends Device_2 {
	private String name;
	private int year;
	
	mp3(){}
	
	mp3(String n, int y){
		name=n;
		year=y;
	}
	
	public String getInfor() {
		return name + " "+year;
	}
}

class S22_2 extends Device_2{
	private String name;
	private int year;
	
	S22_2(){
		
	}
	
	S22_2(String n, int y){
		name=n;
		year=y;
	}
	
	public String getInfor() {
		return name + " "+year;
	}
}

class tv extends Device_2{
	private String name;
	private int year;
	
	tv(){}
	
	tv(String n, int y){
		name=n;
		year=y;
	}
	
	public String getInfor() {
		return name + " "+year;
	}
}
