

package bank.management.system;
import java.sql.*;  

/**
 *
 * @author amitgoel
 */
public class Conn {
   Connection c;
    Statement s;
    
    public Conn()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Amit@2508");    // creating connection , driver manager is class
            s =c.createStatement();  // create statement

            
        }catch(Exception e){ 
            System.out.println(e);
        }  
         
    }
}
