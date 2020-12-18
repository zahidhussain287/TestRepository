package test;


abstract class Sample1{
	
	abstract void disp();
	abstract void test();
}

abstract class Sample2 extends Sample1{
	
	void disp() {
		
		System.out.println("Hi");
	}
	
	static void disp2() {
		
		System.out.println("Static concrete method");
	}
}

class Sample3 extends Sample2{
	
	void test() {
		
		System.out.println("Bye");
	}
	
}

public class AbstractMulti {

	public static void main(String[] args) {

		Sample3 S3=new Sample3();
		S3.disp();
		S3.test();
		
		Sample3.disp2();

	}

}
