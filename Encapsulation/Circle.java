
public class Circle 
{
    private float radius;
	 
    public  float getRadius()
    {
    	return radius;
    }
    public void setRadius(int r)
    {
    	radius=r;
    }
    
    public double CalculateArea()
    {
    	
		
		return 3.14*radius*radius;
    }
    public double CalculatPerimeter()
    {
    	
		
		return 2*3.14*radius;
    }
    
    
}
