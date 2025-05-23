
public class TestCase 
{

	public static void main(String[] args)
	{
		char ch='$';
		
		if(ch>= 97 && ch<=122)
		{
			System.out.println("Small Alphabet");
		}
		else if(ch>=65 && ch<=90)
		{
			System.out.println("Capital Alphabet");
		}
		else if(ch>=48 && ch<=57)
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special Character");
		}
	}

}
