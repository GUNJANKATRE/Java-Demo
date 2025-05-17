
public class Armstrongnumber 
{

	public static void main(String[] args) 
	{
		int n=345,sum=0,rem,copy=n;
		while(n!=0)
		{
			rem=n%10;
			sum=rem*rem*rem;
			n=n/10;
		}
		if(sum==copy)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not Armstrong number");
		}
	}

}