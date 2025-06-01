import java.util.Scanner;

public class StringCharacter {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		
		String str=sc.nextLine();
		
		StringBuilder s1=new StringBuilder();
		StringBuilder s2=new StringBuilder();
		
		 for (int i = 0; i < str.length(); i++) 
		 {
	            
	       if (i % 2 == 0)
	            {
	                s1.append(str.charAt(i)); // Even characters
	            }
	         else 
	            {
	                s2.append(str.charAt(i)); // Odd  characters
	            }
	        }

	        System.out.println("Even Characters: " +s1);
	        System.out.println("Odd Characters:  " +s2);

	}

}
