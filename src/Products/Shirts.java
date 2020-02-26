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
		ShirtsList.add(new Clothing("SUPREME", false, 60, ""));
		ShirtsList.add(new Clothing("Kirklands", true, 10, ""));
		ShirtsList.add(new Clothing("Kalvin Clein", false, 50, ""));
		ShirtsList.add(new Clothing("Goodwill Shirts", true, 0, ""));
	}
}
