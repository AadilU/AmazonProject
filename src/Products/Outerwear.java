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
		OuterwearList.add(new Clothing("Adidas", false, 60, "/Images/didasjacket.png"));
		OuterwearList.add(new Clothing("Kirklands", true, 10, "/Images/kirk jacket.png"));
		OuterwearList.add(new Clothing("Guess", false, 50, "/Images/guessjacxket.png"));
		OuterwearList.add(new Clothing("Goodwill Outerwear", true, 0, "/Images/goodwilljacket.png"));
	}
}
