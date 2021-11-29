# Sales_List

The Sales List application should allow users to enter items for purchase. Each item entry includes the item name, cost, and quantity. Assume all items will cost less than $100. Calculate the total sales after adding each item to the sales list.

Use Java classes to construct the application.

SalesItem : Model each item on the sales list. A SalesItem object should have a name, price, and quantity. Use methods to set, get, and perform calculation operations. Write a toString() method to construct the string for a complete SalesItem object that includes name, price, and quantity.
SalesSlip : Model the list of items. Use an ArrayList (or Linked List) to create the SalesItem objects as they are added to the list. Use methods for adding a sales item, computing the total sales, etc. Write a toString() method to construct the complete list of sales items.
Main: This is the controller that constructs the application window (containing layout views), creates events, and instantiates a SalesSlip object.
