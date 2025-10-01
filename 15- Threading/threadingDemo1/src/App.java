public class App{
    public static void main(String[] args) throws Exception{
        KronometreThread thread1 = new KronometreThread("thread1", 5);
        KronometreThread thread2 = new KronometreThread("thread2", 5);
        KronometreThread thread3 = new KronometreThread("thread3", 5);

        thread1.start();
        thread2.start();
        thread3.start();


    }
}
