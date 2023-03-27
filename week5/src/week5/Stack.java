package week5;

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