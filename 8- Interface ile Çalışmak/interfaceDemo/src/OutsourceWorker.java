//dışardan çalıışan
public class OutsourceWorker implements IWorkable{
    @Override
    public void work() {
        System.out.println("Köle çalıştı");
    }
    
}
