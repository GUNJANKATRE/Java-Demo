import java.util.Scanner;

public class EncryptString 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name: ");
		
		String str=sc.nextLine();
		
		StringBuilder s=new StringBuilder();
		
		int length=str.length();
		for(int i=0;i<str.length();i++)
		{
	    	char ch= str.charAt(i);
	        char encrypt=((char) (ch + length));
			s.append(encrypt);

			/* char ch= str.charAt(i);
	        s.append(char) (ch + length));*/
			
		}
       System.out.println("Encrypted string: " +s.toString());

	}

}
