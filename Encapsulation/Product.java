
public class Product
{
	
       private String ProductName; 
       private String  ProductCode;
	   private long Price;
	      
	      public String getProductName()
	      {
	    	  return ProductName;
	      }
	      public void setProductName(String Name) 
	      {
	    	  ProductName= Name;
	      }
	      public String getProductCode()
	      {
	    	  return ProductCode;
	      }
	      public void setProductCode(String Code) 
	      {
	    	  ProductCode= Code;
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
	    	  float FinalPrice=Price-Discount;
	    	  return FinalPrice;
	      }
	      
}

	



