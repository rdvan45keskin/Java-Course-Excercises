
public class KronometreThread implements Runnable{

    private Thread thread;
    private String threadName;
    private int sure;

    //constructor
    public KronometreThread(String tName, int kSure){
        this.threadName = tName;
        this.sure = kSure;
        System.out.println("Oluşturuluyor : "+tName);
    }
    // run fonksiyonu runnable içinde var ve içine çalışmasını istediğimiz şeyi yazıoz
    @Override
    public void run() {
        System.out.println("Çalıştırılıyor : "+ threadName);
        Kronometre kronometre = new Kronometre(sure);
        kronometre.baslat();
        System.out.println("Bitti : "+ threadName);
    }
    // bu başlatmak için her türlü lazım
    public void start(){
        System.out.println("Thread nesnesi oluşuyor");
        if(thread==null){
            thread = new Thread(this,threadName);
            thread.start();
        }
    }
}