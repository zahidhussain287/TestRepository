package test;


class Demo1{
	
	Demo1(){
		System.out.println("Hi");
	}
	
	Demo1(int a){
		
		this();
		System.out.println("Parameterised");
	}
	
}

class Demo2 extends Demo1{
	
	int a=10;
	Demo2(){
		
		super(10);
		
		System.out.println("Bye");
	}
	
	
}

class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo2 d2=new Demo2();
		
		System.out.println(d2.a);
	}

}
