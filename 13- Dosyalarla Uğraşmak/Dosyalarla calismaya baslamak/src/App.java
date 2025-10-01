import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        readFile();
        writeFile();
        readFile();
    }
    // dosya oluşturma
    public static void createFile(){
        File file = new File("C:\\Users\\Rıdvan Keskin\\Documents\\dersler\\btk\\java\\21- Dosyalarla Uğraşmak\\files\\students.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("dosya oluşturuldu");
            } else {
                System.out.println("dosya zaten mevcut");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //dosya bilgisi alma
    public static void getFileInfo(){
        File file = new File("C:\\Users\\Rıdvan Keskin\\Documents\\dersler\\btk\\java\\21- Dosyalarla Uğraşmak\\files\\students.txt");
        if (file.exists()) { //dosya var ise:
            System.out.println("Dosya adı : "+file.getName());
            System.out.println("Dosya yolu : "+file.getAbsolutePath());
            System.out.println("Dosya yazılabilr mi : "+file.canWrite());
            System.out.println("Dosya okunabilir mi : "+file.canRead());
            System.out.println("Dosya boyutu(byte) : "+file.length());
        }
    }
    //dosya içini okuma
    public static void readFile(){
        File file = new File("C:\\Users\\Rıdvan Keskin\\Documents\\dersler\\btk\\java\\21- Dosyalarla Uğraşmak\\files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){//okunabilecek satır olduğu sürece satır satır oku
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    //dosyaya yazma
    public static void writeFile() {
        try {//alt satıra geçmek için bufferedwriter lazım
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Rıdvan Keskin\\Documents\\dersler\\btk\\java\\21- Dosyalarla Uğraşmak\\files\\students.txt", true));
            writer.newLine();
            writer.write("Indigo");
            System.out.println("Dosyaya Yazıldı");
            writer.close();  // Hem BufferedWriter'ı hem de FileWriter'ı kapatır
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
