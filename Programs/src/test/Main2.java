package test;
	
class Inherit1{
		
	void eating() {
			
		System.out.println("Eating");
	}
		
	void sleeping() {
			
		System.out.println("Sleeping");
	}
		
}
	
class Dog extends Inherit1{
		
	void barking() {
			
		System.out.println("Barking");
	}
}
	
class Monkey extends Inherit1{
		
	void jumping() {
			
		System.out.println("Jumping");
	}
}		

class Main2{
	
	public static void main(String[] args) {
		
		
		Dog d1 = new Dog();
		d1.barking();
		d1.eating();
		d1.sleeping();
		
		Monkey m1 = new Monkey();
		m1.eating();
		m1.sleeping();
		m1.jumping();
	
}
}


