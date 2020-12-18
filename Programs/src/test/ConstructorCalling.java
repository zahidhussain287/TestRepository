package test;

public class ConstructorCalling {

	ConstructorCalling(){
		
		System.out.println("Constructor 1");
	}
	
	ConstructorCalling(int a){
		
		this();
		System.out.println("Constructor 2");
	}
	
	ConstructorCalling(int a, int b){
		
		this(10);
		System.out.println("Constructor 3");
	}
	
	public static void main(String[] args) {
		
		
		new ConstructorCalling(10, 10);	
		
	}

}
