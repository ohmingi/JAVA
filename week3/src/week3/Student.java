package week3;
import java.util.Scanner;

public class Student {
	private String name;
	private int birth;
	
	public Student(String name, int birth) {
		this.name = name;
		this.birth = birth;
	}

	boolean isOlder(Student other) {
		if(this.birth<other.birth) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	String getName() {
		return this.name;
	}
}
