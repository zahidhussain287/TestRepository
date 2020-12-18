package test;

public class ConstructorOverloading {
	
	ConstructorOverloading(){
		
		System.out.println("Constructor 1");
	}
	
	ConstructorOverloading(int a){
		
		System.out.println("Constructor 2");
	}
	
	ConstructorOverloading(double a){
		
		System.out.println("Constructor 3");
	}
	
	ConstructorOverloading(int a,double b){
		
		System.out.println("Constructor 4");
	}
	
	ConstructorOverloading(double a, int b){
		
		System.out.println("Constructor 5");
	}

	public static void main(String[] args) {
		
		new ConstructorOverloading();
		new ConstructorOverloading(10);
		new ConstructorOverloading(1.2);
		new ConstructorOverloading(10,1.2);
		new ConstructorOverloading(1.3,12);

	}

}
