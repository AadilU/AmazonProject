package Products;

public class Item {
	private String itemName;
	private int price;
	public Item(String itemName, int price) {
		this.itemName = itemName;
		this.price = price;
	}
	protected String getName() {
		return itemName;
	}
	protected int getPrice() {
		return price;
	}
}
