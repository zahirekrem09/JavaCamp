public class Main {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        Category category1 = new Category();
        category1.id = 1;
        category1.name = "laptop";
        Product product1 = new Product();
        product1.id=1;
        product1.name="Lenovo";
        product1.unitPrice=10000;
        product1.stockAmount=11;
        product1.description="16 gb ram 256 ssd";
        product1.category=category1;

        Product product2 = new Product(2,"Lenovo 2","8 gb ram",12000,12);
        Product product3 = new Product();
        productManager.addToCart(product1);
	Product[] products = {
	        product1,product2,product3
    };
	System.out.println(product2.name);


    }
}
