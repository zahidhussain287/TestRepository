package test;


class Class1{
	
	void display() {
		
		System.out.println("Hi");
	}
}

class Class2 extends Class1{
	
	void display() {
		
		System.out.println("Bye");
	}
}



class TypeCastOverride {

	public static void main(String[] args) {
		
		Class1 C1 = new Class2();
		
		C1.display();
	}

}
