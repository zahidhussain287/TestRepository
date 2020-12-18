package test;

class vehicle{
	
	void fuelSupply() {
		
		System.out.println("Supplying Fuel");
		
	}
}

class car extends vehicle{
	
	void fuelSupply() {
		
		System.out.println("Supplying Diesel");
	}
	
	void beaches() {
		
		System.out.println("Beach");
	}
}

class bike extends vehicle{
	
	void fuelSupply() {
		
		System.out.println("Supplying Petrol");
	}
	
}

class transport{
	
	static void travel(vehicle v) {
		
		v.fuelSupply();
	}
}

public class RunTime {

	public static void main(String[] args) {
		
		vehicle v1 = new car();
		v1.fuelSupply();
		
		car c = (car)v1;
		c.beaches();
		c.fuelSupply();
		
		
		
		bike b1 = new bike();
		transport.travel(b1);
		
	
	}

}
