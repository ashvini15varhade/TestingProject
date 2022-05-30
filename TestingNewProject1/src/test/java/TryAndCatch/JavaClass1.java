package TryAndCatch;

public class JavaClass1 {
	public static void main(String[] args) {
		int a = 10 ;
		int b = 2 ;
		int c = 45 ;
		int d[] = {1,45,32,76};
		
		//Run time exception only
		// Exception Code
		
		System.out.println("Hi");
		try
		{
			c = a/b;
			System.out.println(d[7]);
		}
		// Alternative Code
		catch(ArithmeticException e)
		{
			System.out.println("alternative code ArithmeticException");
			b = 1 ;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("alternative code ArrayIndexOutOfBoundsException");
			b = 1 ;
		}

}

}
