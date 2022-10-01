public class Classeswithattribute {
    public static void main(String[] args) {

        Product product = new Product(1,"Laptop","Asus Laptop",3000,20);


        ProductManager productManager = new ProductManager();

        productManager.Add(product);
        productManager.Sell(product);
        System.out.println(product.getKod());

    }
}
