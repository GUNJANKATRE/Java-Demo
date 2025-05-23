public class Pallindron 
{
 public static void main(String[] args)
	{
		int n=451,rev=0,copy=n;
		while(n!=0) 
		{
		    rev=rev*10+(n%10);
			n=n/10;
		}
		if(rev==copy)
		{
			System.out.println("The Number is Pallindrone");
		}
		else
		{
			System.out.println("The Number is not Pallindrone");
		}

	}

}
