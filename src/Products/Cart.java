package Products;

import java.util.ArrayList;
import java.util.LinkedList;

public class Cart {
	private static Cart single_instance = null;
	private static LinkedList<Item> cartList = new LinkedList<Item>();
	
	public Cart() {
		
	}
	public void addItem(String itemName, int price) {
		cartList.add(new Item(itemName, price));
	}
	public LinkedList retrieveItems() {
		return cartList;
	}
	public static Cart getInstance() 
    { 
        if (single_instance == null) 
            single_instance = new Cart(); 
  
        return single_instance; 
    } 
}
