import java.util.ArrayList;
import java.util.Collections;

//belirli bir veri tipiyle(int,str) ile çalışmaya yarar
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("Ankara");
        sehirler.add("Istanbul");
        sehirler.add("Izmir");
        sehirler.add("Aydın");

        Collections.sort(sehirler);
        for(String sehir:sehirler){
            System.out.println(sehir);
        }
    }
}
