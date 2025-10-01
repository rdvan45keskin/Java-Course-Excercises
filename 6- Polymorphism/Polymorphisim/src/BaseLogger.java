public class BaseLogger {
    public void log(String message){
        //burda overriding yapıyoruz
        //file,email,database,console bunun çocukları gibi bişey ve bunun üstüne bir şeyler yazabiliyorlar
        System.out.println("Default Logger : "+ message);
    }
}
