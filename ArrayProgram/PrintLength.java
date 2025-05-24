
public class PrintLength
{

	public static void main(String[] args)
	{
		String fruit[]= {"Apple","Banana","Orange","Watermelon","MaskMelon"};
		
		for(int i=0;i<fruit.length;i++)
		{
			if(fruit[i].length()<=6)
			System.out.println(fruit[i]);
		}
	}

}
