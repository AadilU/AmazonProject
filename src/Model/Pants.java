package Model;

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
		PantsList.add(new Clothing("Adidas Pants", false, 60, "/Images/didaspants.png"));
		PantsList.add(new Clothing("Kirklands Pants", true, 10, "/Images/kirkpant.png"));
		PantsList.add(new Clothing("Levis Pants", false, 50, "/Images/levipants.png"));
		PantsList.add(new Clothing("Goodwill Pants", true, 0, "/Images/GWPants.png"));
	}
}
