
public class EvenNumber 
{

	public static void main(String[] args) 
	{
		int count=0;
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				count++;
				sum=sum+i;
			}
		}
		System.out.println("Total Even Number=" + count +  " And Sum=" +sum);
     }
	
}
