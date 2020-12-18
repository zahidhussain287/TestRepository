package test;

class Sample{
	
	int a;
	Sample(int a){
		
		this.a=a;
		
	}
	
	void disp() {
		
		System.out.println(a);
	}
}
public class This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample s1=new Sample(10);
		
		s1.disp();
		
		
	}

}
