package week5;

interface  USB_4{
	void readUSB();
	default void writeUSB() {
		System.out.println("Can't write to USB");
	}
}

interface USBA_4 extends USB_4{
	void connectA();
}

interface USBC_4 extends USB_4{
	void connectC();
}

class S22_4 implements USBC_4{
	private String name;
	
	S22_4(String s){
		name=s;
	}
	
	public void readUSB() {
		System.out.println(name+": USB read");
	}
	
	public void writeUSB() {
		System.out.println(name+": USB write");
	}
	
	public void connectC() {
		System.out.println(name+": USB-C connected");
	}
}

class MP3_4 implements USBA_4{
	private String name;
	
	MP3_4(String n){
		name=n;
	}
	
	public void readUSB() {
		System.out.println(name+": USB read");
	}
	
	public void connectA() {
		System.out.println(name+": USB-A connected");
	}
}

public class Lab05_4 {
	static void connect(USB_4 u) {
		if(u instanceof USBC_4) {
			S22_4 s=(S22_4)u;
			s.connectC();
		}
		
		if(u instanceof USBA_4){
			MP3_4 m=(MP3_4)u;
			m.connectA();
			
		}
	}
	
	static void readUSB(USB_4 u) {
		u.readUSB();
	}

	static void writeUSB(USB_4 u) {	
		u.writeUSB();
	}
	
	public static void main(String [] args) {
		S22_4 s22=new S22_4("S22");
		MP3_4 mp3=new MP3_4("MP3");
		
		USB_4 [] hub=new USB_4[] {s22,mp3};
		for(USB_4 u:hub) {
			connect(u);
			readUSB(u);
			writeUSB(u);
		}
	}
}
