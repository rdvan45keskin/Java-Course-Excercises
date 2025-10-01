import java.util.HashMap;

//python dict ile aynı şey

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String,String> sozluk = new HashMap<String,String>();
        sozluk.put("book","kitap");
        sozluk.put("table","masa");
        sozluk.put("computer","bigisayar");
        System.out.println(sozluk.size());
        for (String item : sozluk.keySet()){
            System.out.println("Eleman-"+item+" Değer-"+sozluk.get(item));
        }

        //System.out.println(sozluk.get("table"));
        sozluk.remove("table");

    
    }
}
