
public class Calculateavg
{

	public static void main(String[] args) 
	{
	    int sum = 0;
		int count=1;
		float avg=0;
		for(int i=23; i<=34; i++)
			{
				sum=sum+i;
			    avg=sum/count;
			    count++;
			}
		System.out.println(avg);
		

	}

}
