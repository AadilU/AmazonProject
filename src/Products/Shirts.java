package Products;

import java.util.LinkedList;

public class Shirts{
	static LinkedList<Clothing> ShirtsList;
	
	public Shirts()
	{
		ShirtsList = new LinkedList();
		initList();
	}
	
	public void initList()
	{
		ShirtsList.add(new Clothing("SUPREME", false, 99999, "/Images/suuwoopreme.jpg"));
		ShirtsList.add(new Clothing("Kirklands", true, 10, "/Images/kirkshirt.jpg"));
		ShirtsList.add(new Clothing("Kalvin Clein", false, 50, "/Images/ckshirt.jpg"));
		ShirtsList.add(new Clothing("Goodwill Shirts", true, 0, "/Images/gwshirts.jpg"));
	}
}
