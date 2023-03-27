package week3;

public class main {
	
	public static void main(String []args) {
		Car car1=new Car();
		Car car2=new Car("MC20");
		Car car3=new Car("MC20","white");
		Car car4=new Car("MC20","white",2021);
		
		car1.printinfor();
		car2.printinfor();
		car2.printinfor();
		car3.printinfor();
	}
}
