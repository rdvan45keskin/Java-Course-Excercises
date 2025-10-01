import java.util.ArrayList;

//dizilerin daha gelişmiş hali en çok bu kullanılıyor
//dizilerde 3 eleman tanımladıktan sonra 4.yü tanımlayamayız ama bunda öyle değil
//int, string karışık yollayabiliyoz normal dizilerde bu yok
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList sayilar = new ArrayList();
        //System.out.println(sayilar.size());
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");//                          -- eleman ekleme
        //System.out.println(sayilar.size());               -- boyutunu söylüo
        //System.out.println(sayilar.get(2));               -- belirtilen indexteki elemanı getir
        //sayilar.set(2,100);                               -- belirtilen indekstekini belirtilen değerle değiştir
        //sayilar.remove(0)                                 -- belirtilen indexteki elemanı sil
        //sayilar.clear()                                   -- listedeki tüm elemanları temizler
        
        for (Object i:sayilar){
            System.out.println(i);
        }
        
        
    }
}
