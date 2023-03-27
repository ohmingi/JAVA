package week3;

public class main2 {
	
	static void printInfor(Student st1, Student st2) {
		if(st1.isOlder(st2)) {
			System.out.println(st1.getName()+" > "+st2.getName());
		}
		
		else if(!st1.isOlder(st2)){
			System.out.println(st1.getName()+" <= "+st2.getName());
		}
	}
	
	public static void main(String []args) {
		
		
		Student s1 = new Student("pby",19900212);
		Student s2 = new Student("dlwlrma", 19930516);
		Student s3= new Student("JianLee", 19981104);
		printInfor(s1,s2);
		printInfor(s3,s2);
		
	}
}
