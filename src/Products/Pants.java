package Products;

import java.util.LinkedList;

public class Pants{
	public LinkedList<Clothing> PantsList;
	
	public Pants()
	{
		PantsList = new LinkedList();
		initList();
	}
	
	public void initList()
	{
		PantsList.add(new Clothing("Adidas", false, 60, "src/Images/ckshirt.png"));
		PantsList.add(new Clothing("Kirklands", true, 10, "src/Images/kirkpant.jpg"));
		PantsList.add(new Clothing("Levis", false, 50, "src/Images/levipants.jpg"));
		PantsList.add(new Clothing("Goodwill Pants", true, 0, "src/Images/GWPants.JPG"));
	}
}
