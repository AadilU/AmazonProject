package Products;

public class Clothing extends Product{
	public String size;
	
	
	public Clothing(String name, boolean onSale, int price, String imagePath)
	{
		super(name, onSale, price, imagePath);
	}
	
	public void setDimensions(String size)
	{
		this.size = size;
	}
}
