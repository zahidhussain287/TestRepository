package test;

class Name{
	
	String name;
	private double salary;
	
	Name(String name,double salary){
		
		this.name=name;
		this.salary=salary;
		}
	
	public void getName() {
		
		System.out.println(name);
	}
	
	public double getSalary() {
		
		System.out.println(salary);
		return salary;
		
	}
	
	public void setName(String name) {
		
		this.name=name;
	}
	
	public void setSalary(double salary) {
		
		this.salary=salary;
	}
	
	
}

public class Encapsulation {

	public static void main(String[] args) {


		Name obj = new Name("Zahid",53000);
		
		obj.getName();
		obj.getSalary();
		System.out.println("Modify Salary");
		
		obj.setSalary(65000);
		obj.getSalary();
		
		obj.setName("Afreen");
		obj.getName();

	}

}
