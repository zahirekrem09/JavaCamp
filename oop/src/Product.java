public class Product {
    // Constructor Method
    public Product() {
        System.out.println("Run Constructor");
    }
    // Constructor Method
    public Product(int id, String name, String description, double unitPrice, int stockAmount) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.unitPrice = unitPrice;
        this.stockAmount = stockAmount;
    }
    int id;
    String name;
    String description;
    double unitPrice;
    int stockAmount;
    Category category;
}
