package TryAndCatch;

public class JavaClass {
	public static void main(String[] args) {
		int a = 10 ;
		int b = 0 ;
		int c = 45 ;
		
		//Run time exception only
		// Exception Code
		
		System.out.println("Hi");
		try
		{
			c = a/b;
		}
		// Alternative Code
		catch(ArithmeticException e)
		{
			System.out.println("alternative code");
			b = 1 ;
		}
		System.out.println(c);
	}

}
