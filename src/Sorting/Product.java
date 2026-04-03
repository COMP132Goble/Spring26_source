package Sorting;

public class Product {
    private String sku;         // Stock Keeping Unit (unique identifier)
    private String name;        // Product name
    private double price;       // Price in USD
    private int quantity;       // Quantity in sock
    private String category;    // Product category

    public Product(String sku, String name, double price, int quantity, String category) {
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getSku() {
        return sku;
    }

    public String name() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public String toString() { 
        String output = String.format("%s:   %s\n\t$%.2f\n\t%s\n\t%d",
                     this.sku, this.name, this.price, this.category, this.quantity);
        return output;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product("B001", "Laptop", 999.99, 15, "Electronics"),
            new Product("A002", "Desk Chair", 249.99, 30, "Furniture"),
            new Product("C003", "Coffee Maker", 79.99, 50, "Appliances"),
            new Product("A001", "Monitor", 299.99, 20, "Electronics"),
            new Product("B002", "Keyboard", 49.99, 100, "Electronics"),
            new Product("C001", "Toaster", 29.99, 75, "Appliances"),
        };

        for(Product product: products) {
            System.out.println(product);
        }
    }
}
