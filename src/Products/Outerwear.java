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
		OuterwearList.add(new Clothing("Adidas", false, 60, "src/Images/didasjacket.jpg"));
		OuterwearList.add(new Clothing("Kirklands", true, 10, "src/Images/kirk jacket.jpg"));
		OuterwearList.add(new Clothing("Guess", false, 50, "src/Images/guessjacxket.jpg"));
		OuterwearList.add(new Clothing("Goodwill Outerwear", true, 0, "src/Images/goodwilljacket.jpg"));
	}
}
