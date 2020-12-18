package test;

class Single {
		
		void test() {
			
			System.out.println("Hi");
		}	
}

	class multiLevel extends Single{
		
		void add() {
			
			System.out.println("Bye");
		}
		
}

class main1{
		public static void main(String args[]) {
			// TODO Auto-generated method stub

			
			multiLevel m1=new multiLevel();
			m1.test();
			m1.add();	
		

	}
}