package week2;
import java.util.Scanner;

public class week2_5 {
	
	public static int[][] makeArray(int x,int y,int z) {
		int tmp [][]=new int[3][];
		tmp[0]=new int[x];
		tmp[1]=new int[y];
		tmp[2]=new int[z];
		
		System.out.println("정수 8개를 입력하세요");
		Scanner scanner=new Scanner(System.in);
		
		for(int i=0;i<tmp.length;i++) {
			for(int t=0;t<tmp[i].length;t++) {
				
				tmp[i][t]=scanner.nextInt();
			}
		}
		
		return tmp;
	}
	
	public static void main(String []args) {
		int [][] array;
		array=makeArray(3,1,4);
		
		System.out.print("\n");
		
		for(int [] i:array) {
			for(int t:i) {
				System.out.print(t +" ");
			}
			
			System.out.print("\n");
		}
		
	}

}

