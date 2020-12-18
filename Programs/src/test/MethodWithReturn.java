package test;

public class MethodWithReturn {

	static int add(int a, int b) {
		
		int c=a+b;
		return c;
		
	}
	public static void main(String[] args) {

		System.out.println("Main Method Started");
		
		System.out.println(add(10,20));
		
		System.out.println("Main Method Ended");
		

	}

}
