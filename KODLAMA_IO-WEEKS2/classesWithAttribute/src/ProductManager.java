public class ProductManager {
    public void Add(Product product){
        //JDBC
        System.out.println("urun eklendi " + product.getName());
    }
    public void Sell(Product product){
        System.out.println("urun satildi " + product.getDescription());
    }
    public  void Add2 (int id ,String name, String description, int stockAmount, double price){

    }
}
