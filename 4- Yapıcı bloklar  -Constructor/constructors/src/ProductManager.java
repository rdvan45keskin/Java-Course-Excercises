public class ProductManager {
    public void Add(Product product){
        //JDBC
        System.out.println("ürün eklendi: "+ product.getName());
    }
    /*
    ---bu çok gereksiz bir uygulama bir şey eklemek istersek her kullandığımız yerde tek tek eklemek gerekcek
    public void Add2(int id, String name, String description,int stockAmount, Double price){
    }
    */
}
