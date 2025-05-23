
public class CheckPrimeOrNot
{

	public static void main(String[] args)
	{
		int num=7;
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%1==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Its Prime Number");
		}
		else
		{
			System.out.println("Its Not Prime Number");
		}

	}

}
