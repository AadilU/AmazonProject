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
		ShirtsList.add(new Clothing("SUPREME", false, 99999, "src/Images/suuwoopreme.jpg"));
		ShirtsList.add(new Clothing("Kirklands", true, 10, "src/Images/kirkshirt.jpg"));
		ShirtsList.add(new Clothing("Kalvin Clein", false, 50, "src/Images/ckshirt.jpg"));
		ShirtsList.add(new Clothing("Goodwill Shirts", true, 0, "src/Images/gwshirts.jpg"));
	}
}
