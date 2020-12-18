package test;

public class MethodOverload {
	
	String name;
	int age;
	
	MethodOverload(String name1,int age1){
		
		name =name1;
		age=age1;
		
	}
	
	void disp() {
		
		System.out.println(name);
		System.out.println(age);
	}
	
	static void javaClass(MethodOverload m1) {
		
		m1.disp();
		System.out.println("JavaClass");
		
	}
	
	static void selClass(MethodOverload m2) {
		
		m2.disp();
		System.out.println("Selenium Class");
	}
	

	public static void main(String[] args) {
		
		MethodOverload m3 = new MethodOverload("Zahid", 25);
		
		javaClass(m3);
		selClass(m3);
		

	}

}
