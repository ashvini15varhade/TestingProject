package TryAndCatch;

public class JavaClass4 {

	public static void main(String[] args) {
		int a = 10 ;
		int b = 2 ;
		int c = 45 ;
		int d[] = {1,45,32,76};
		System.out.println("Hi");
		 // Run time exception only
		// Exception Code
		
	
		try
		{
			c = a/b;
			System.out.println(d[7]);
		}
		// Alternative Code
		catch(ArithmeticException e)
		{
			System.out.println("alternative code ArithmeticException");
			b = 1;
			c = a/b;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		// Important code
		finally
		{
			System.out.println("finally");
		}
			System.out.println("value of c = "+c);
	}

}
