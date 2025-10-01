// ---Yöntem 1---
public class CustomerManager {

    BaseDatabaseManager databaseManager;

    public void getCustomers(){
        databaseManager.getData();
    }
}

// ---Yöntem 2---
// public class CustomerManager{
//     private BaseDatabaseManager databaseManager;

//     public CustomerManager(BaseDatabaseManager manager){
//         this.databaseManager = manager;
//     }
//     public void getCustomers(){
//         this.databaseManager.getData();
//     }
// }
