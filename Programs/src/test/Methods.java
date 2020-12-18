package test;

public class Methods {
	
	 void add(int a,int b) {
		
		int c=a+b;
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		
		System.out.println("Main Method Started");
		Methods obj = new Methods();
		obj.add(10,20);
		
		System.out.println("Main Method Ended");

	}

}
