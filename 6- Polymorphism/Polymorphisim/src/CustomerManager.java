public class CustomerManager {
    //sadece bu classta kullanmak için baseLogger adında bir referans saklar
    private BaseLogger baseLogger;

    //burada CustomerManager içine BaseLoggerın çocuklarını yani File,Email,Database,Console gibi classları yolluyoruz
    //dışarıdan gönderilen parametre : logger
    public CustomerManager(BaseLogger logger){
        this.baseLogger = logger;
        //Gelen logger referansını sınıfın baseLogger alanına atar
    }
    public void add(){
        System.out.println("Müşteri eklendi");
        //atanmış referansın Log fonksiyonunu çağırır
        this.baseLogger.log("Log mesajı");
    }
}
