package Products;

import java.util.LinkedList;

public class Pants{
	LinkedList<Clothing> PantsList;
	
	public Pants()
	{
		PantsList = new LinkedList();
		initList();
	}
	
	public void initList()
	{
		PantsList.add(new Clothing("Adidas", false, 60));
		PantsList.add(new Clothing("Kirklands", true, 10));
		PantsList.add(new Clothing("Levis", false, 50));
		PantsList.add(new Clothing("Goodwill Pants", true, 0));
		
		
	}

}
