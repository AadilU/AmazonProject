package Model;

import java.util.LinkedList;

public class Shirts{
	public static LinkedList<Clothing> ShirtsList;
	
	public Shirts()
	{
		ShirtsList = new LinkedList();
		initList();
	}
	
	public void initList()
	{
		ShirtsList.add(new Clothing("SUPREME Shirt", false, 99999, "/Images/suuwoopreme.png"));
		ShirtsList.add(new Clothing("Kirklands Shirt", true, 10, "/Images/kirkshirt.png"));
		ShirtsList.add(new Clothing("Kalvin Clein Shirt", false, 50, "/Images/ckshirt.png"));
		ShirtsList.add(new Clothing("Goodwill Shirts", true, 0, "/Images/gwshirts.png"));
	}
}
