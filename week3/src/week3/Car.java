package week3;
import java.util.Scanner;

public class Car {
	String model;
	String color;
	int year;
	
	public Car() {
		this("null","null",0);
	}
	
	public Car(String model){
		this(model,"null",0);
	}
	
	public Car(String model, String color){
		this(model,color,0);
	}
	
	public Car(String model,String color,int year){
		this.model=model;
		this.color=color;
		this.year=year;
	}
	
	void printinfor() {
		System.out.println(this.model+" "+this.color+" "+this.year);
	}
	
}
