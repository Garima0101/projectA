package Inheritance;

public class C extends B {

	public static void main(String[] args) {
		
     C.A2();
	 C c = new C();
	c.A1();
	c.B1();
	c.B1(6);
	c.B1(5, 5);
	
	System.out.println(c.add(4, 4));		
	}

	
	
	
	
}