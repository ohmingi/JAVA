import java.util.Scanner;

public class week1_4 {
	public static void main(String[] args) {
		System.out.print("원의 중심과 반지름 입력: ");
		int x; int y; double radius;
		
		Scanner scanner=new Scanner(System.in);
		x=scanner.nextInt();
		y=scanner.nextInt();
		radius=scanner.nextDouble();
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("점 입력: ");
		double x1; double y1;
		
		x1=s.nextDouble();
		y1=s.nextDouble();
		
		double check =Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
				
		
		if(check<radius) {
			System.out.printf("점(%f, %f)는 원 안에 있다.",x1,y1);
		}
		
		else if(check==radius) {
			System.out.printf("점(%f, %f)는 원 경계선에 있다.",x1,y1);
		}
		
	}
	
	
}
