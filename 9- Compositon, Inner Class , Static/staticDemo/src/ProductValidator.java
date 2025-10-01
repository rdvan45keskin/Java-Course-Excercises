//bir ürünü kaydederken veya güncellerken kurallara uygun mu diye bakma
public class ProductValidator {

    static {
        System.out.println("Static yapıcı blok çalıştı");
    }
    public ProductValidator(){
        System.out.println("Yapıcı blok çalıştı");
    }
    //static kullanırsak newlemeye gerek kalmaz ama kalıcı olarak oluşur
    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public void bisey(){

    }
}
