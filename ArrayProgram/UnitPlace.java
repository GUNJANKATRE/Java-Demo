
public class UnitPlace {

	public static void main(String[] args)
	{
		int Numbers[]= {456,678,989,123,335,544,342,651,870};
		
	     for(int i=0;i<Numbers.length;i++)
	     {
	    	 int unitdigit=Numbers[i]%10;
	    	 System.out.println("Numbers: " +Numbers[i] + " -> UnitDigit: " +unitdigit);
	    	 
	     }

	}

}
