import java.util.*;

class CartItem {
	 String itemName;
	 double price;
	 int quantity;

	 // Constructor
	 CartItem(String itemName, double price, int quantity) {
	     this.itemName = itemName;
	     this.price = price;
	     this.quantity = quantity;
	 }

	 // Method to calculate total price for the item
	 double getTotalPrice() {
	     return price * quantity;
	 }
	}

public class Shopping_cart {
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     ArrayList<CartItem> cart = new ArrayList<>();
	     int choice;

	     do {
	         System.out.println("\n--- Shopping Cart Menu ---");
	         System.out.println("1. Add Item to Cart");
	         System.out.println("2. Remove Item from Cart");
	         System.out.println("3. View Total Cost");
	         System.out.println("4. Display All Items");
	         System.out.println("5. Exit");
	         System.out.print("Enter your choice: ");
	         choice = sc.nextInt();
	         sc.nextLine(); // consume newline

	         switch (choice) {
	             case 1:
	                 System.out.print("Enter Item Name: ");
	                 String name = sc.nextLine();

	                 System.out.print("Enter Price: ");
	                 double price = sc.nextDouble();

	                 System.out.print("Enter Quantity: ");
	                 int quantity = sc.nextInt();

	                 cart.add(new CartItem(name, price, quantity));
	                 System.out.println("Item added to cart!");
	                 break;

	             case 2:
	                 System.out.print("Enter Item Name to Remove: ");
	                 String removeName = sc.nextLine();

	                 boolean removed = false;
	                 Iterator<CartItem> it = cart.iterator();
	                 while (it.hasNext()) {
	                     CartItem item = it.next();
	                     if (item.itemName.equalsIgnoreCase(removeName)) {
	                         it.remove();
	                         removed = true;
	                         System.out.println("Item removed successfully.");
	                         break;
	                     }
	                 }
	                 if (!removed) {
	                     System.out.println("Item not found in cart.");
	                 }
	                 break;

	             case 3:
	                 double total = 0;
	                 for (CartItem item : cart) {
	                     total += item.getTotalPrice();
	                 }
	                 System.out.println("Total Cost: ₹" + total);
	                 break;

	             case 4:
	                 if (cart.isEmpty()) {
	                     System.out.println("Cart is empty.");
	                 } else {
	                     System.out.println("\n--- Cart Items ---");
	                     for (CartItem item : cart) {
	                         System.out.println("Item: " + item.itemName + ", Price: ₹" + item.price +
	                                 ", Quantity: " + item.quantity + ", Total: ₹" + item.getTotalPrice());
	                     }
	                 }
	                 break;

	             case 5:
	                 System.out.println("Thank you for shopping!");
	                 break;

	             default:
	                 System.out.println("Invalid choice. Please try again.");
	         }

	     } while (choice != 5);
	}

}