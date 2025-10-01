//built-in  javanın içindeki classlar
import matematik.*;


public class App {
    public static void main(String[] args) throws Exception {
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adınız: ");
        String isim = scanner.nextLine();
        System.out.println("Merhaba "+isim);
        */

        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.topla(2,3,4,5));

        Logaritma logaritma = new Logaritma();
        System.out.println(logaritma.logaritmaHesapla());

    }
}
