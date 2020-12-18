package test;

class MethodOverride2 {
	
	void disp(){
		
		System.out.println("Hi");
	}
}
class MethodOverride extends MethodOverride2{
		
		void disp(){
			
			System.out.println("Bye");
		}

	public static void main(String[] args) {
	
		MethodOverride m2 = new MethodOverride();
		m2.disp();	
	}

}
