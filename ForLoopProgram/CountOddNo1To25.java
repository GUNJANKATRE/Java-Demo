
public class CountOddNo1To25
{

	public static void main(String[] args)
	{
		int count=0;
		for(int i=1;i<=25;i++)
		{
			if(i%2!=0)
		    count++;
		}
		System.out.println("Odd Numbers " +count);
	}

}
