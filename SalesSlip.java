package beaty;

import java.util.ArrayList;

/**
 * SalesSlip : Model the list of items.
 * Use an ArrayList (or Linked List) to create the SalesItem objects as they are added to the list.
 * Use methods for adding a sales item, computing the total sales, etc.
 * Write a toString() method to construct the complete list of sales items.
 */

public class SalesSlip {
	public ArrayList <SalesItem> shoppingList = new ArrayList<SalesItem>();
	
	//constructors, both with one item and empty
	public SalesSlip(SalesItem item) {
		shoppingList.add(item);
	}
	public SalesSlip() {
		
	}
	
	//add a new item to the list
	public void add(SalesItem item) {
		shoppingList.add(item);
	}
	
	//compute the total cost of the items on the list
	public double getTotal() {
		double total = 0;
		for(SalesItem item: shoppingList) {
			total += item.totalCost();
		}
		return (Math.round((total)*100.0)/100.0);
	}
	
	public String toString() {
		String s = "";
		for(SalesItem item: shoppingList) {
			s += item.toString() + "\n";
		}
		return s;
	}
}
