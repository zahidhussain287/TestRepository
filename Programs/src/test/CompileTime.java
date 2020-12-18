package test;

public class CompileTime {
	
	static void add(int a, int b) {
		
		int c=a+b;
		System.out.println(c);
	}
	
	static void add(double a, double b) {
		
		double c=a+b;
		System.out.println(c);
	}
	
	

	public static void main(String[] args) {

		add(10.1,20.4);

	}

}
