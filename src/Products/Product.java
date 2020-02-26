package Products;

import java.awt.Image;

import javax.swing.ImageIcon;

abstract class Product {
	
	public String name;
	public boolean onSale;
	public int price;
	public Image c;
	
	public Product(String name, boolean onSale, int price, String imagePath)
	{
		this.name = name;
		this.onSale = onSale;
		this.price = price;
		initImage(imagePath);
	}
	
	public void initImage(String path)
	{
		ImageIcon ii = new ImageIcon(path);
		c = ii.getImage();
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
	
	public Image getImage()
	{
		return c;
	}
	
	abstract void setDimensions(String size);
}
