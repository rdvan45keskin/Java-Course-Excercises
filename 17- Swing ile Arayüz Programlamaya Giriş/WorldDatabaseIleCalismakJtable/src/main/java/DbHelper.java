
import java.sql.*;

public class DbHelper {
    private String userName="root";
    private String password = "3B8820F117";
    private String dbUrl="jdbc:mysql://localhost:3306/world";

    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dbUrl,userName,password);
    }
    
    public void showErrorMessage(SQLException ex){
        System.out.println("Error : "+ex.getMessage());
        System.out.println("Error code : "+ex.getErrorCode());
    }
}
