public class Kronometre {
    private int sure;  // Kronometre süresi (saniye cinsinden)

    //constructor
    public Kronometre(int sure) {
        this.sure = sure;
    }

    public void baslat() {
        for (int i = 1; i <= sure; i++) {
            System.out.println("Kronometre: " + i + " saniye");
            try {
                Thread.sleep(1000);  // 1 saniye beklet
            } catch (InterruptedException e) {
                System.out.println("Kronometre kesildi.");
            }
        }
        System.out.println("Kronometre bitti.");
    }
}