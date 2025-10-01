public class App {
    public static void main(String[] args) throws Exception {
        //constructor kullanımı
        Product product = new Product(1,"Notebook","Monster Notebook",40000,3);
        System.out.println("ID: " + product.getId());
        System.out.println("Name: " + product.getName());
        System.out.println("Description: " + product.getDescription());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Stock Amount: " + product.getStockAmount());
        System.out.println("Code: " + product.getCode());
        /* 
        Yukarıdaki daha mantıklı constructorları sevdim
        //setter ile veri alma
        product.setId(1);
        product.setName("Notebook");
        product.setDescription("Monster Notebook");
        product.setPrice(40000.0);
        product.setStockAmount(3);
        product.getCode();
        */
        //product manager classını çekip içinden add fonksiyonunu aldık ve içine product değeri yolladık
        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getCode());
    }
}
