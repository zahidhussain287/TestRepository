package test;


abstract class vehicle1{
	
	abstract void fuelSupply();
	
	void horn() {
		
		System.out.println("Pom Pom");
	}
}

class car1 extends vehicle1{
	
	void fuelSupply() {
		
		System.out.println("Diesel");
	}
}

class bike1 extends vehicle1{
	
	void fuelSupply() {
		
		System.out.println("Petrol");
	}
}

class transport1{
static void travel(vehicle1 v1) {
	
	v1.fuelSupply();
	v1.horn();
}
}
public class AbstractClass2 {

	public static void main(String[] args) {
		
		car1 c1=new car1();
		transport1.travel(c1);
		
		bike1 b1=new bike1();
		transport1.travel(b1);

	}

}
