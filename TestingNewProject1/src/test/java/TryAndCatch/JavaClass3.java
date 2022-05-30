package TryAndCatch;

public class JavaClass3 {
	public static void main(String[] args) {
		int a = 10 ;
		int b = 2 ;
		int c = 45 ;
		int d[] = {1,45,32,76};
		
		//Run time exception only
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
		//Important code
		finally
		{
			System.out.println("finally");
		}
			System.out.println(c);
	}
}
           
       // Exception generated and get handelled
       // try -> finally -> Normal flow

       //Exception not generated
       // try -> finally -> Normal flow
       
       // Exception generated and not get handelled
       // try -> finally

