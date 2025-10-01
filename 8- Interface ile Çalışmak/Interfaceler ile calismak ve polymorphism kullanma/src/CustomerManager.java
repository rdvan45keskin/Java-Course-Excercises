public class CustomerManager {
    //dışarıdan değiştirilemeyen bir değişken oluşturma
    private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal){
        //değişkene dışarıdan gelen değeri atama(oracle,mysql gibi)
        this.customerDal = customerDal;
    }
    public void add(){
        // iş kodları yazılır veriler doğru mu diye test edilmesi
        // atanan değişkendeki fonksiyonu kullanma
        this.customerDal.add();
    }
}
