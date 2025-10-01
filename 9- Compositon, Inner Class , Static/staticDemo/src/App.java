public class App {
    public static void main(String[] args) throws Exception {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.price = 10.0;
        product.name = "Mouse";

        manager.add(product);

        DatabaseHelper.Crud.delete();
        DatabaseHelper.Connection.createConnection();
    }
}
