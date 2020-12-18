package test;

class Demo4{
	
	void beaches() {
		
		System.out.println("Play in Beach");
		
	}
}

class Demo3 extends Demo4{
	
	void traffic() {
		
		System.out.println("Full Traffic");
	}
	
}

class TypeCast {

	public static void main(String[] args) {
		
		Demo4 D1 = new Demo3();
		
		D1.beaches();
		
		Demo3 D2=(Demo3)D1;
		
		D2.beaches();
		
		D2.traffic();
		
	}

}
