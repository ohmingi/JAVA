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

public class Lab05_2 {
	
	static void printInfor(Device_2 a) {
		System.out.println(a.getInfor());
	}
	
	public static void main (String []args) {
		S22_2 s22 =new S22_2("S22",2022);
		mp3 mp= new mp3("MP3",2005);
		tv Tv=new tv("TV",2017);
		
		Device_2 [] d= new Device_2[3];
		
		d[0]= s22;
		d[1]=mp;
		d[2]=Tv;
		
		for(int i=0;i<3;i++) {
			printInfor(d[i]);
		}
	}
}
