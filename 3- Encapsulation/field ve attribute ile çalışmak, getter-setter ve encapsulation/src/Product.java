public class Product {
    // attribute veya field deniyo bunlara
    //private sadece tanımlandığı classta geçerli
    //encapsulate yaparken private yapmak gerekli
    //getter setter 
    // bu değerlerin başına _koyarak da ayırabilirmişiz
    private int id;
    private String name;
    private String _description;
    private double _price;
    private int _stockAmount;

    //getter --idye değer yazamaz ama okuyabilir şu anda
    public int getId(){
        return id;
    }
    //setter --idye değer vermeye yarıyo
    public void setId(int id){
        this.id=id;
        //this demek product classındaki id
        //setterID fonksiyonuna gelen id
    }
    /************************************************************/
    //gettter --nameye değer yazamaz ama okuyabilir şu anda
    public String getName(){
        return name;
    }
    //setter --nameye değer vermeye yarıyo
    public void setName(String name){
        this.name=name;
        //this demek product classındaki name
        //setterName fonksiyonuna gelen name
    }
    /************************************************************/
    //getter --descriptiona değer yazamaz ama okuyabilir şu anda
    public String getDescription(){
        return _description;
    }
    //setter --descriptiona değer vermeye yarıyo
    public void setDescription(String description){
        _description=description;
    }
    /************************************************************/
    //getter --pricea değer yazamaz ama okuyabilir şu anda
    public Double getPrice(){
        return _price;
    }
    //setter --pricea değer vermeye yarıyo
    public void setPrice(Double price){
        _price=price;
        //this demek product classındaki id
        //diğer id parametreden gelen id
    }
    /************************************************************/
    //gettter --stockAmounta değer yazamaz ama okuyabilir şu anda
    public int getStockAmount(){
        return _stockAmount;
    }
    //setter --stockAmounta değer vermeye yarıyo
    public void setStockAmount(int stockAmount){
        _stockAmount=stockAmount;
        //this demek product classındaki id
        //diğer id parametreden gelen id
    }
    public String getCode(){
        return this.name.substring(0,1)+ id;
    }


}
