import java.util.Scanner;

public class week1_3 {
	public static void main(String[] args) {
		System.out.print("점 (x, y)의 좌표를 입력하시오: ");
		int x; int y;
		
		Scanner scanner=new Scanner(System.in);
		x=scanner.nextInt();
		y=scanner.nextInt();
		
		if(x>=100&&x<=200&&y<=200&&y>=100) {
		System.out.printf("(%d, %d)는 사각형 안에 있습니다.",x,y);
		}
		
	}
	
	
}
