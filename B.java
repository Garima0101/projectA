package Inheritance;

public class B extends A {

	
	public void A1()
	{
		System.out.println("This is A1 of B Class");
		super.A1();
		
	}
	
	public static void A2()
	{
		A.A2();
		System.out.println("This is A2 of B Class");
		
	}
	
	
	public int add(int x , int y)
	{
		System.out.println(super.add(3, 4));
		int result = x + y ;
		//System.out.println(result);
		return result ;
	}
	
	public void B1()
	{
		System.out.println("This is B1 of B Class");
	}
	
	public void B1(int x)
	{
		System.out.println(x);
	}
	public void B1(int x, int y)
	{
		
		System.out.println(x+y) ;
	}
}


