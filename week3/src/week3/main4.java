package week3;

public class main4 {
	public static void main(String [] args) {
		int [] array1= {1993, 0, 5, 1, 6};
		int [] array2= {1990, 0, 2, 1, 2};
		int [] array3;
		
		array3 =ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}
}
