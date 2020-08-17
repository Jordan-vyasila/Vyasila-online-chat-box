package nithotel;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;


public class conn {
    
    Connection c;
    Statement s;
    
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
