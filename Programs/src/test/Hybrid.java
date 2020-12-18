package test;

class RBI {

	void RBIBank() {
		
		System.out.println("Head Branch");
	}	
}

class ICICI extends RBI{
	
	void ICICIBank() {
		
		System.out.println("Credit");
	}
}

class Axis extends RBI{
	
	void AxisBank() {
		
		System.out.println("Debit");
	}
}

class Hybrid{
	public static void main(String[] args) {
		
		Axis ax = new Axis();
		ax.RBIBank();
		ICICI ic = new ICICI();
		ic.RBIBank();
		RBI rb = new RBI();
		rb.RBIBank();

	}
}
