package week5;
import java.util.Scanner;

abstract class Stack {
	public abstract int length();
	public abstract int capacity();
	public abstract String pop();
	public abstract boolean push(String str);
	
	
}

class StringStack extends Stack {
	private int tos=-1;
	private String [] s;
	private int cap;
	
	StringStack(int n){
		s=new String[n];
		cap =n;
	}
	
	@Override	
	public int length() {
		return tos;
	}
	
	public int capacity() {
		return cap;
	}
	
	
	public String pop() {
		if(tos==-1) {
			return null;
		}
		
		return s[tos--];
	}
	
	public boolean push(String str) {
		if(tos+1==cap) {
			return false;
		}
		
		else {
			s[++tos]=str;
			
			return true;
		}
	}
}

public class Lab05_3 {
	public static void main(String [] args) {
		System.out.print("size of stack: ");
		
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		
		StringStack ss=new StringStack(n);
		
		while(true) {			
			System.out.print("input: ");
		
			Scanner sc=new Scanner(System.in);
			String s=scanner.next();
			
			if(s.equals("exit")) {break;}
			
			
				if(ss.push(s)) {
					
				}
				else {
					System.out.println("stack is full!");
				}
			}
			
		
			
		System.out.print("pop all strings: ");
		for(int i=0;i<n;i++) {
			System.out.print(ss.pop()+" ");
		}
		
	}
}
