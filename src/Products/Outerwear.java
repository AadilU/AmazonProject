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
		OuterwearList.add(new Clothing("Adidas", false, 60, "/Images/didasjacket.jpg"));
		OuterwearList.add(new Clothing("Kirklands", true, 10, "/Images/kirk jacket.jpg"));
		OuterwearList.add(new Clothing("Guess", false, 50, "/Images/guessjacxket.jpg"));
		OuterwearList.add(new Clothing("Goodwill Outerwear", true, 0, "/Images/goodwilljacket.jpg"));
	}
}
