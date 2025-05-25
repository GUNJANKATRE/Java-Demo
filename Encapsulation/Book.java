
public class Book 
{
	      private String Title;
		  private String Author;
	      private long Price;
	      
	      public String getTitle()
	      {
	    	  return Title;
	      }
	      public void setTitle(String BookName) 
	      {
	    	  Title= BookName;
	      }
	      public String getAuthor()
	      {
	    	  return Author;
	      }
	      public void setAuthor(String  BookAuthor) 
	      {
	    	  Author=BookAuthor;
	      }
	      public long getPrice()
	      {
	    	  return Price;
	      }
	      public void setPrice(long p) 
	      {
	    	  Price= p;
	     }
	      
	      
	      public float applyDiscount(float Percentage)
	      {
	    	  float  Discount=(Price*Percentage)/100;
	    	  float finalPrice=Price-Discount;
	    	  return finalPrice;
	      }
		 			
		}
	      



