
public class ProductInfo
{
	public static void main(String[]args)
	{
	Product p=new Product();
	
        p.setProductName("Oppo");
        p.setProductCode("A15");
        p.setPrice(18000);
   
       System.out.println("Product Name= " +p.getProductName());
       System.out.println("Product Code= "+p.getProductCode());
       System.out.println("Price= "+p.getPrice());
   
       System.out.println(p.applyDiscount(60));
	}
}
