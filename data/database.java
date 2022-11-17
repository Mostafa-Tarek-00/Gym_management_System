
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException  {
        
    String url="jdbc:mysql://localhost:3306/gymdata";
    String user="root";
    String password="";
    String driver="com.mysql.cj.jdbc.Driver";
    
    try{
        Class.forName(driver).newInstance();
    Connection connection=DriverManager.getConnection(url,user,password);
    System.out.println("good");
    } 
    
    catch(SQLException e){
    System.out.println("bad");
    e.printStackTrace();
    }
    
    
}
}