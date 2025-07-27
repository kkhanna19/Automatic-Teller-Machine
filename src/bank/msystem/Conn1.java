package bank.msystem;
import java.sql.*;

public class Conn1 {
    Connection c;
    Statement s;
    
    Conn1(){
    try {
        
        c = DriverManager.getConnection("jdbc:mysql:///BankSystem", "root", "root");
        s = c.createStatement();
    } catch (Exception e) {
        System.out.println(e);
    }
        
    }
    
}
