public class Percentage 
{

	public static void main(String[] args) 
	{
		int Marks[]= {98,97,90,95,96};
		
		int total=0;
		
		for(int i=0;i<Marks.length;i++)
		{
			total=total+Marks[i];
		}
		double Per=total/5;
		System.out.println("Total Marks: " +total);
		System.out.println("Percentage: " +Per);

	}

}
