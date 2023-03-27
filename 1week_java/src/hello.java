import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
			
		System.out.print("나이:");
		int age=scanner.nextInt();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("아름:");
		String name=sc.nextLine();
		
		System.out.print(age+name);
		
	
		scanner.close();
		sc.close();
		
	
	}

}
