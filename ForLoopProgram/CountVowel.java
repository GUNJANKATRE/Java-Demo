
public class CountVowel 
{

	public static void main(String[] args) 
	{
		int count=0;
		for(char ch='D';ch<='Z';ch++)
		{
			if(ch=='A'|| ch=='E'||ch=='I'|| ch=='O'|| ch=='U')
				 count++;
		}
		System.out.println(count);
	}

}
