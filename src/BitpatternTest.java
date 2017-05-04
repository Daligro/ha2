import org.junit.Test;
import org.junit.Before;



public class BitpatternTest
{
	private Bitpattern bit;
	
	@Before
	public void kontoErzeugen() 
	{
	bit = new Bitpattern();
	}
	
	@Test
	public void setBit()
	{
		
		System.out.println(bit.setBit(42, 2));
	
	}
	
	@Test
	public void inBinary()
	{

		int[] numberArray = bit.inBinary(2);
		
		for(int a : numberArray)
			System.out.print(a);
		
	}
	
	@Test
	public void endsOn()
	{
	
		if(bit.endsOn(7,"11"))
		System.out.println("true");
		else
		System.out.println("false");
		
	}
}
