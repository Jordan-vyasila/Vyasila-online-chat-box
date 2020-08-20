package nithotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;


public class conn {

    static String prepareStatement(String insert_into_Registrationfirstnamelastname) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    Connection c;
    Statement s;
    PreparedStatement pst;
    
    public conn(){
    try{
    
            Class.forName("com.mysql.jdbc.Driver");
            c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/hotelmanagement","root","");
            s=(Statement) c.createStatement();
    }catch(Exception e){
    e.printStackTrace();
    }
    }
    
}
