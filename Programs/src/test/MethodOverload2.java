package test;

public class MethodOverload2 {
	
	String name;
	double mileage;
	
	MethodOverload2(String name1,double mileage1){
		
		name=name1;
		mileage=mileage1;
		
	}
	
	static void service(MethodOverload2 m2, String service) {
		
		System.out.println(m2.name+" is "+service);
	}
	
	static void Fuel(MethodOverload2 m3, double litres) {
		
		System.out.println(m3.name+" is filled with "+litres);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverload2 m4 = new MethodOverload2("Audi",8.4);
		
		service(m4, "Fully Serviced");
		
		Fuel(m4, 30.4);

	}

}
