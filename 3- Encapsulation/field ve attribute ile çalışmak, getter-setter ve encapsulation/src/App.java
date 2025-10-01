public class App {
    public static void main(String[] args) throws Exception {
        Product product = new Product();
        //kullanım buna döndü
        product.setId(1);
        product.setName("Notebook");
        product.setDescription("Monster Notebook");
        product.setPrice(40000.0);
        product.setStockAmount(3);
        product.getCode();

        //product manager classını çekip içinden add fonksiyonunu aldık ve içine product değeri yolladık
        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getCode());

    }
}
