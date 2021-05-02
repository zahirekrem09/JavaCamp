public class Main {

    public static void main(String[] args) {
        /*
         class lar referans tiptir.
         instance alma islemi
         sadece ihtiyac duyuldugunda instance cıkarılmalı
                CustomerManager customerManager = new CustomerManager();
                Calculator calculator = new Calculator();
        */

        Product product = new Product();
        //product.name = "Laptop";
        //product.setName("Laptop");
        product.setId(1);
        System.out.println(product.getName());

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

       /*
        int sonuc = calculator.add(12,23);
        System.out.println(sonuc);
        dot notosyon ile medhodları kullnma
        customerManager.Add();
        customerManager.Update();
        customerManager.Delete();
       */


    }
}


