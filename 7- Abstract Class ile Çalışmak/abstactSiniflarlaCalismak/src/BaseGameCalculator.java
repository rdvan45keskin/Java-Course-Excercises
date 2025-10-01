//BaseGameCalculatoru kim kullanıyorsa hesapla ve gameOver fonksiyonlarını kullanmak zorunda
//abstract sınıflar asla new ile kullanılamaz. newlemek için operasyonu ezmek gerekir
public abstract class BaseGameCalculator {
    //hesapla fonksiyonunu override etmek yani kendisi oluşturmak zorunda
    public abstract void hesapla();

    //gameOver fonksiyonunu olduğu gibi kullanmak zorunda
    public final void gameOver(){
        System.out.println("Oyun bitti");
    }
}
