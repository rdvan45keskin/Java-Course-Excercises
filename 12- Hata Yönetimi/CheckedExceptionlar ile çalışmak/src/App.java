import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
    /*  seçenek 1
    public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Rıdvan Keskin\\Documents\\dersler\\btk\\java\\20- Hata Yönetimi\\CheckedExceptionlar ile çalışmak\\src\\sayilar.txt"));
    } 
    */

    public static void main(String[] args) throws Exception{
        BufferedReader reader = null;
        int total = 0;
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\Rıdvan Keskin\\Documents\\dersler\\btk\\java\\20- Hata Yönetimi\\CheckedExceptionlar ile çalışmak\\src\\sayilar.txt"));
            String line = null;
            //her satırı boş değer gelene kadar oku
            while((line = reader.readLine()) !=null){
                total += Integer.valueOf(line);
            } 
            System.out.println("Toplam : "+total);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }finally {
            reader.close();
        }
    }
}
