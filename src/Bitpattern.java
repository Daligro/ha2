import org.junit.Test;


public class Bitpattern {

		public int setBit(int number, int position)
		{
			
			String binary = Integer.toBinaryString(number);
			if(position<0 || position>binary.length())
			{
				throw new IllegalArgumentException();
			}
			else
			{
			int index = binary.length()-position-1;
			char[] binaryChar = binary.toCharArray();
			binaryChar[index]='1';
			String binaryNew = new String(binaryChar);
			return Integer.parseInt(binaryNew,2);
			}
				
		}
	
		public static int[] inBinary(int number)
		{
			if(number<0)
			{
				throw new IllegalArgumentException();
			}else{
				String numberString = Integer.toBinaryString(number);
				char[] numberCharArray = numberString.toCharArray();
				int[] numberIntArray = new int[numberCharArray.length];
				for(int i = 0 ; i < numberCharArray.length ; i++)
				{
					numberIntArray[i]=Character.getNumericValue(numberCharArray[i]);
				}
				return numberIntArray;
			}
		}
		
	public static boolean endsOn(int number, String pattern)
	{
		String numberString = Integer.toBinaryString(number);
		
		
	String numberStringNew = numberString.substring(numberString.length()-1-pattern.length());
	
	if(numberStringNew.equals(numberString))
		{
			return true;
		}else{
			return false;
		}
	}

}