package Control;

import java.awt.Image;

import javax.swing.ImageIcon;

public abstract class Product {
	
	public String name;
	public boolean onSale;
	public int price;
	public Image c;
	public String imgn;
	
	public Product(String name, boolean onSale, int price, String imagePath)
	{
		this.name = name;
		this.onSale = onSale;
		this.price = price;
		this.imgn = imagePath;
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
	
	public String getImageName()
	{
		return imgn;
	}
	
	public abstract void setDimensions(String size);
}
