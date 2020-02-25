package Products;

import java.awt.Image;

<<<<<<< HEAD
}
=======
abstract class Product {
	
	private String name;
	private boolean onSale;
	private int price;
	
	public Product(String name, boolean onSale, int price)
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
}
>>>>>>> branch 'master' of https://github.com/AadilU/AmazonProject.git
