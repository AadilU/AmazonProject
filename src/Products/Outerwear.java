package Products;

import java.util.LinkedList;

public class Outerwear{
	public LinkedList<Clothing> OuterwearList;
	
	public Outerwear()
	{
		OuterwearList = new LinkedList();
		initList();
	}
	
	public void initList()
	{
		OuterwearList.add(new Clothing("Adidas", false, 60, ""));
		OuterwearList.add(new Clothing("Kirklands", true, 10, ""));
		OuterwearList.add(new Clothing("Guess", false, 50, ""));
		OuterwearList.add(new Clothing("Goodwill Outerwear", true, 0, ""));
	}
}
