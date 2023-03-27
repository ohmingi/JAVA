package week2;
import java.util.Scanner;;

public class week2_4 {
	public static void main(String [] args) {
		int [][] array;
		array=new int[2][3];
		int count =0;
		int i=0, t=0;
		
		System.out.println("정수 6개를 하나씩 입력하세요");
		
		while(count!=6) {
			
			
			System.out.print(">");
			Scanner scanner = new Scanner(System.in);
			
			if(scanner.hasNextInt())
			{
				if(t!=3) {
					int k=scanner.nextInt();
					array[i][t]=k;
					t++;
				}
				
				else if(t==3) {
					t=0;
					i=1;
					int k=scanner.nextInt();
					array[i][t]=k;
					t++;
				}
				
				else if(i==1&&t!=3) {
					int k=scanner.nextInt();
					array[i][t]=k;
					t++;
				}
				
				
				count ++;		
			}
			
			else {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
			}
			
		}
		
		for(int[] k : array) {
			for(int e:k) {
				System.out.print(e+" ");
			}
			
			System.out.print("\n");
		}
		
	}
}
