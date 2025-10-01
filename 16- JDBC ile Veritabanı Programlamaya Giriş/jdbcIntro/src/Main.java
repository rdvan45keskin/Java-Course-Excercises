import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {
        selectDemo();
    }
    //seçme işlemi için
    public static void selectDemo() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;         //sql sorgusu
        ResultSet resultSet;                //sql sorgusunun sonucu
        try{
            connection = helper.getConnection();
            System.out.println("Bağlantı oluştu");
            statement = connection.createStatement();   //bağlantıya sorgu yolluyoz
            resultSet = statement.executeQuery("select code,Name,Continent,Region from country");   //sorguyu çalıştır
            ArrayList<Country> countries = new ArrayList<Country>();
            while(resultSet.next()){
                countries.add(new Country(
                                resultSet.getString("Code"),
                                resultSet.getString("Name"),
                                resultSet.getString("Continent"),
                                resultSet.getString("Region")
                        )
                );
            }
            System.out.println(countries.size());
            //System.out.println(countries.get(5));
            for (Country country : countries) {
                System.out.println(country);   // toString() metodu çağrılır
            }
        } catch (SQLException ex){
            helper.showErrorMessage(ex);
        }finally{
            connection.close();
        }
    }

    public static void insertDemo() throws  SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;         //hazır sql sorgusu kullanıcıdan gelen bilgi
        ResultSet resultSet;                        //sql sorgusunun sonucu
        try{
            connection = helper.getConnection();
            String querry = "insert into city (Name,CountryCode,District,Population) values (?,?,?,?)";
            System.out.println("Bağlantı oluştu");
            statement = connection.prepareStatement(querry);   //sorguyu çalıştır
            statement.setString(1,"Akhisar");
            statement.setString(2,"TUR");
            statement.setString(3,"Manisa");
            statement.setInt(4,100000);
            int result = statement.executeUpdate(); //sorguyu çalıştır ve etkilenen kayıt sayısını göster
            System.out.println("Kayıt eklendi");
            System.out.println(result);
        } catch (SQLException ex){
            helper.showErrorMessage(ex);
        }finally{
            statement.close();
            connection.close();
        }
    }

    public static void updateDemo() throws  SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;         //hazır sql sorgusu kullanıcıdan gelen bilgi
        ResultSet resultSet;                        //sql sorgusunun sonucu
        try{
            connection = helper.getConnection();
            String querry = "update city set population=?,district=? where id = ?";
            System.out.println("Bağlantı oluştu");
            statement = connection.prepareStatement(querry);   //sorguyu çalıştır
            statement.setInt(1,180000);
            statement.setString(2,"Manisa");
            statement.setInt(3,4084);
            int result = statement.executeUpdate(); //sorguyu çalıştır ve etkilenen kayıt sayısını göster
            System.out.println("Kayıt güncellendi");
            System.out.println(result);
        } catch (SQLException ex){
            helper.showErrorMessage(ex);
        }finally{
            statement.close();
            connection.close();
        }
    }

    public static void deleteDemo() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;         //hazır sql sorgusu kullanıcıdan gelen bilgi
        ResultSet resultSet;                        //sql sorgusunun sonucu
        try{
            connection = helper.getConnection();
            String querry = "delete from city where id = ?";
            System.out.println("Bağlantı oluştu");
            statement = connection.prepareStatement(querry);   //sorguyu çalıştır
            statement.setInt(1,4083);
            int result = statement.executeUpdate(); //sorguyu çalıştır ve etkilenen kayıt sayısını göster
            System.out.println("Kayıt silindi");
            System.out.println(result);
        } catch (SQLException ex){
            helper.showErrorMessage(ex);
        }finally{
            statement.close();
            connection.close();
        }
    }
}