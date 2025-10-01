// ... koymak birden fazla istediğimiz kadar değer göndereceğimizi söylüo
public class App {
    public static void main(String[] args) throws Exception {
        int sayi = topla(5,7);
        float toplam = topla2(2,3,4,5,6,10);
        System.out.println(sayi);
        System.out.println(toplam);
    }
    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    public static float topla2(int... sayilar){
        float toplam = 0;
        for (float sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
}
