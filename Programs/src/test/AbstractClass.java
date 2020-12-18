package test;


abstract class Demo8{
	
	abstract void disp();
	abstract void test();
}

class Demo9 extends Demo8{
	
	void disp() {
		System.out.println("Hi");
	}
	
	void test() {
		
		System.out.println("Bye");
	}
	
}


public class AbstractClass {

	public static void main(String[] args) {
		
		Demo8 d1=new Demo9();
		
		d1.disp();
		d1.test();

	}

}
