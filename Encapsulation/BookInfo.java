
public class BookInfo 
{

	public static void main(String[] args)
	{
		Book b=new Book();
		
	        b.setTitle("THINK AND GROW RICH  ");
	        b.setAuthor("Napolean Hill ");
	        b.setPrice(200L);
	      
	      System.out.println(b.getTitle());
	      System.out.println(b.getAuthor());
	      System.out.println(b.getPrice());
	      
	      System.out.println(b.applyDiscount(20));
	}

}
