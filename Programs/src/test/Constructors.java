package test;

public class Constructors {
	
	String name;
	int age;
	double salary;
	String desg;
	
	Constructors(String name1, int age1, double salary1,String desg1){
		
		name=name1;
		age=age1;
		salary=salary1;
		desg=desg1;
		
	}
	
	void sleeping() {
		
		System.out.println("Sleeping");
	}
	
	void details() {
		
		System.out.println("name = "+name);
		System.out.println("age = "+age);
		System.out.println("salary = "+salary);
		System.out.println("desg = "+desg);
	}

	public static void main(String[] args) {

		Constructors C1 = new Constructors("Zahid", 25, 25000, "Software Tester");
		
		C1.sleeping();
		
		C1.details();


	}

}
