package TryAndCatch;

public class JavaClass2 {
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
			System.out.println(d[2]);
		}
		// Alternative Code
		catch(ArithmeticException e)
		{
			System.out.println("alternative code ArithmeticException");
			try
			{
				
				System.out.println(d[2]);
			}
		
			catch(ArrayIndexOutOfBoundsException j)
			{
				System.out.println("alternative code for ArrayIndexOutOfBoundsException");
				
			}
			b=1;
		}
		
	
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("alternative code for ArrayIndexOutOfBoundsException");
			
		}
		System.out.println(c);

}
}



