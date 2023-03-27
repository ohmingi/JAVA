package week3;
import java.util.Arrays;

public class ArrayUtil {
	public static int [] concat(int [] arr1,int [] arr2) {
		
		int len=arr1.length+arr2.length;
		int [] a3=new int[len];
		
		System.arraycopy(arr1, 0, a3, 0, arr1.length);
        
        System.arraycopy(arr2, 0, a3, arr1.length, arr2.length);
        
        return a3;
	}
	
	public static void print(int [] arr3) {
		System.out.print("[ ");
		for(int a:arr3) {
			System.out.print(a+" ");
		}
		System.out.print(" ]");
	}
}
