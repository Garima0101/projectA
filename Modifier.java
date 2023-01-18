package Inheritance;

import AccessModifier.ClassB;

public class Modifier extends ClassB{

	public static void main(String[] args) {
		// Concept of private modifier
		// Only Accessible in declared class

		
		Modifier M = new Modifier () ;
		
		M.show(); //Private method
		M.A2(); //protected method of ClassB.java
		M.A4(); //Public method of ClassB.java
		
	}

	
	//declared as private
	private  void show()
	 {
		 
		 System.out.println("This is a private method"); 
		 
		 
	 }
	
	//declared as public
	public void show (int a )
	{
		
		System.out.println(a) ;
	}
	
	//default
	void show (int a, int b )
	{
		
		System.out.println(a+b) ;
	}
}
