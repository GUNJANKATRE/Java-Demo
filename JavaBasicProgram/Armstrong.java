
public class Armstrong 
{

	public static void main(String[] args) 
	{
		int n=252;
		int sum=0;
		int rem;
		int copy=n;
		while(n!=0)
		{
			rem=n%10;
			sum+=rem*rem*rem;
			n=n/10;
		}
		if(sum==copy)
		{
			System.out.println("The Number is Armstrong No");
		}
		else
		{
			System.out.println("The  Number is Not Armstrong No.");
		}

	}

}
