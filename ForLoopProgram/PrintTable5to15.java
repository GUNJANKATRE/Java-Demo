
public class PrintTable5to15
{

	public static void main(String[] args)
	{
		int i=5;
     	while(i<=15)
		{
			for(int j=1;j<=10;j++) 
			{
			  System.out.print(" " +i*j);
		     }
			i++;
			System.out.println();
		}
     }
}
