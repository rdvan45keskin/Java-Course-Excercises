public class App {
    public static void main(String[] args) throws Exception {
        //baselogger dizisi oluşturup içindeki classları new ile çekiyoruz
        //yeni bir class eklemek çok basit
        //dizinin içine new ile dosyayı eklemek sadece ama dosyaya BaseLogger ı inherit etmeyi unutmuyoruz
        //plug and play (tak çalıştır sistem deniyomuş)
        /* 
        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
        for (BaseLogger logger: loggers){
            logger.Log("Log mesajı");
        }
        */

        //CustomerManagerin içine yollanan parametreye göre çıktı değişiyor
        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();
    }
}
