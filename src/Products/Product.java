package Products;

import java.awt.Image;

abstract class Product {
	
	private String name;
	private boolean onSale;
	private int price;
	
	public Product(String name, boolean onSale, int price, String imagePath)
	{
		this.name = name;
		this.onSale = onSale;
		this.price = price;
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean getOnSale()
	{
		return onSale;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	abstract void setDimensions(String size);
}
