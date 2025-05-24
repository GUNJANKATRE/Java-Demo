public class CountVowel
{
    public static void main(String[] args)
	{
		char Symbols[]= {'@','a','U','&','O','@','o','%','I','O'};
		
		int count=0;
		for(int i=0;i<Symbols.length;i++)
		{
			char ch=Symbols[i];
			if(ch=='a'|| ch=='e'||ch=='i'|| ch=='o'||ch=='u'|| ch=='A'||ch=='E'|| ch=='I'||ch=='O'|| ch=='U')
				count++;
		}
	  System.out.println(count);
	}

}
