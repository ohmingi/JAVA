package week5;

class People {
	private String name;
	private String number;
	
	public void setName(String n) {
		name=n;
	}
	
	public void setNumber(String n) {
		number=n;
	}
	
	public String rName() {
		return name;
	}
	
	public String rNumber() {
		return number;
	}
	
}


class Student extends People {
	private int stcode;
	
	Student(String name, String rnumber, int stcode){
		setName(name);
		setNumber(rnumber);
		this.stcode=stcode;
	}
	
	String getName() {
		 return rName();
	}
	
	String getSsn() {
		return rNumber();
	}
	
	int getId() {
		return stcode;
	}
}



public class Lab05_1 {
	public static void main(String [] atgs) {
		Student s=new Student("dlwlrma","930516-2xxxxxx",12231234);
		System.out.println("name: "+s.getName());
		System.out.println("ssn: "+s.getSsn());
		System.out.println("id: "+s.getId());
	}
}
