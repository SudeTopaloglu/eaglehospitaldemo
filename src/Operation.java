
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Operation {
    
    Connection con = null;
    Statement sta = null;
    PreparedStatement psta = null;
    
    public Operation(){
        
        String url = "jdbc:mysql://"+Database.host+":"+Database.port+"/"+Database.db_name;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,Database.id,Database.password);
            System.out.println("Connected");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Connection failed.");
        }
    }
    
    public static void main(String[] args){
        Operation op = new Operation();
    }
}

