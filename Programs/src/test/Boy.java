package test;

class Human{
	   void walk()
	   {
	       System.out.println("Human walks");
	   }
	}
	class Boy extends Human{
		
	   void talk(){
		   
	       System.out.println("Boy walks");
	   }
	   public static void main( String args[]) {
	       
	       Human obj = new Boy();
	       obj.walk();
	       
	       Boy obj2 =(Boy)obj;
	       obj2.walk();
	       obj2.talk();
	     
	       
	       
	   }
	}
