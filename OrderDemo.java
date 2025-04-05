// Base class: Order
class Order {
    String name;
    String details;
    int id;

    // Method to display order details
    public void displayOrder() {
        System.out.println("ID: " + id + "; Name: " + name + "; Details: " + details);
    }
}

// Derived class: Delivery (inherits from Order)
class Delivery extends Order {
    String information;
    String date; // Changed to String to store a date format
    String address;

    // Method to display delivery details
    public void displayDelivery() {
        System.out.println("Information: " + information + "; Date: " + date + "; Address: " + address);
    }
}

// Main class: Make sure the class name is exactly "OrderDemo"
public class OrderDemo {
    public static void main(String[] args) {
        // Creating an Order object
        Order order = new Order();
        order.id = 101;
        order.name = "Laptop";
        order.details = "Electronics";
        order.displayOrder(); // Display order details

        // Creating a Delivery object
        Delivery delivery = new Delivery();
        delivery.information = "Shipped";
        delivery.date = "20-02-2025";
        delivery.address = "123 Street, City";
        delivery.displayDelivery(); // Display delivery details
    }
}