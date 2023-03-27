package week3;
import java.util.Scanner;

public class Student2 {
	private String name;
	private int birth;
	
	Student2(String n,int b){
		this.name=n;
		this.birth=b;
	}
	
	void printInfor() {
		System.out.println(this.name+" "+this.birth);
	}
}
