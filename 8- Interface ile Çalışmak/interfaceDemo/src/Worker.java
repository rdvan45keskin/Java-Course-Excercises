//bizim çalışanımız
public class Worker implements IWorkable,IEatable, IPayable{
    @Override
    public void work() {
        System.out.println("Iscimiz calisti");
    }
    @Override
    public void eat(){
        System.out.println("Iscimiz yedi");
    }
    @Override
    public void pay() {
        System.out.println("Iscimiz parasini aldi");
    }
}
