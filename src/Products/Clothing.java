package Products;

public class Clothing extends Product{
	private String size;
	
	public Clothing(String name, boolean onSale, int price)
	{
		super(name, onSale, price);
	}
	
	public void setDimensions(String size)
	{
		this.size = size;
	}


}
