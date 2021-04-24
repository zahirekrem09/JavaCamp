public class Product {

    // Attribut veya feild
    // public heryerden ulasabiliriz
    /*int id;
    String name;
    String description;
    double price;
    int stockAmount;*/

    // private sadece tanımlandıgı blockta gecerlidir.
    private int  id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String code;

    // getter
    public int getId() {
        return id;
    }

    // setter
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    // read only
    public  String getCode() {
        return  this.name.substring(0,1) + this.id;
    }
}
