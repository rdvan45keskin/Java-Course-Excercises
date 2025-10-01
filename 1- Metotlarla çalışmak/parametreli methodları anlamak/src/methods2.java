//sayı için int türünde fonksiyon
//kelime için string türünde fonksiyon
//void değer döndürmüyor
public class methods2 {
    public static void main(String[] args) throws Exception {
        String mesaj = "bugün hava çok güzel.";
        String yenimesaj = sehirVer();
        System.out.println(yenimesaj);
        int sayi = topla(5,7);
        System.out.println(sayi);
    }

    public static void ekle(){
        System.out.println("Eklendi");
    }
    public static void sil() {
        System.out.println("Silindi");
    }
    public static void guncelle() {
        System.out.println("Güncellendi");
    }
    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    public static String sehirVer(){
        return "ankara";
    }
}
