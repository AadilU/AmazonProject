package Products;

import java.util.ArrayList;
import java.util.LinkedList;

public class Cart {
	LinkedList<Item> cartList;
	public Cart() {
		
	}
	public Cart(String itemName, int price) {
		cartList = new LinkedList<Item>();
		addItem(itemName, price);
	}
	public void addItem(String itemName, int price) {
		cartList.add(new Item(itemName, price));
	}
	public LinkedList retrieveItems() {
		return cartList;
	}
}
