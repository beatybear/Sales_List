package beaty;

/**
 * SalesItem : Model each item on the sales list.
 * A SalesItem object should have a name, price, and quantity.
 * Use methods to set, get, and perform calculation operations.
 * Write a toString() method to construct the string for a complete SalesItem object that includes name, price, and quantity.
 */

public class SalesItem {
	public String name;
	public double price;
	public int quantity;
	
	public SalesItem(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//calculate the total cost for how many of the item are being bought
	public double totalCost() {
		return (Math.round((price*quantity)*100.0)/100.0);
	}
	
	//overload toString with more valuable information
	public String toString() {
		return (name + "\t$" + (Math.round((price)*100.0)/100.0) + "\t" + quantity);
	}

	//setters and getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
